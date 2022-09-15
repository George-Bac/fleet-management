package com.project.fleetmanagement.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
@Table(name = "vehicle_hires")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "vehicleHireId")
public class VehicleHire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleHireId;

    private String price;

    private String remarks;

    private String timeOut;

    private String timeIn;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOut;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateIn;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", insertable = false, updatable = false)
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "client_id", insertable = false, updatable = false)
    private Client client;

    @ManyToOne
    @JoinColumn(name = "location_id", insertable = false, updatable = false)
    private Location location;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        VehicleHire that = (VehicleHire) o;
        return vehicleHireId != null && Objects.equals(vehicleHireId, that.vehicleHireId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
