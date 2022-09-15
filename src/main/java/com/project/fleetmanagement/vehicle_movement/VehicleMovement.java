package com.project.fleetmanagement.vehicle_movement;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.project.fleetmanagement.location.Location;
import com.project.fleetmanagement.vehicle.Vehicle;
import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.springframework.format.annotation.DateTimeFormat;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "vehicle_movements")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "vehicleMovementId")
public class VehicleMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleMovementId;

    private String remarks;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date1;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date2;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", insertable = false, updatable = false)
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "location_id1", insertable = false, updatable = false)
    private Location location1;

    @ManyToOne
    @JoinColumn(name = "location_id2", insertable = false, updatable = false)
    private Location location2;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        VehicleMovement that = (VehicleMovement) o;
        return vehicleMovementId != null && Objects.equals(vehicleMovementId, that.vehicleMovementId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
