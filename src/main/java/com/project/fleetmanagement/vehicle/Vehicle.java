package com.project.fleetmanagement.vehicle;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.project.fleetmanagement.employee.Employee;
import com.project.fleetmanagement.vehicle_make.VehicleMake;
import com.project.fleetmanagement.vehicle_model.VehicleModel;
import com.project.fleetmanagement.vehicle_status.VehicleStatus;
import com.project.fleetmanagement.vehicle_type.VehicleType;
import com.project.fleetmanagement.location.Location;
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
@Table(name = "vehicles")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "vehicleId")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;

    private String name;

    private String vehicleNumber;

    private String description;

    private String power;

    private String fuelCapacity;

    private String netWeight;

    private String remarks;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate registrationDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate acquisitionDate;

    @ManyToOne
    @JoinColumn(name = "vehicle_type_id", insertable = false, updatable = false)
    private VehicleType vehicleType;

    @ManyToOne
    @JoinColumn(name = "vehicle_make_id", insertable = false, updatable = false)
    private VehicleMake vehicleMake;

    @ManyToOne
    @JoinColumn(name = "vehicle_status_id", insertable = false, updatable = false)
    private VehicleStatus vehicleStatus;

    @ManyToOne
    @JoinColumn(name = "vehicle_model_id", insertable = false, updatable = false)
    private VehicleModel vehicleModel;

    @ManyToOne
    @JoinColumn(name = "employee_id", insertable = false, updatable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "location_id", insertable = false, updatable = false)
    private Location location;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Vehicle vehicle = (Vehicle) o;
        return vehicleId != null && Objects.equals(vehicleId, vehicle.vehicleId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
