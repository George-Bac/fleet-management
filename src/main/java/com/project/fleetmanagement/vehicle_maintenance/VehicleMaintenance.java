package com.project.fleetmanagement.vehicle_maintenance;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.project.fleetmanagement._model.Auditable;
import com.project.fleetmanagement.supplier.Supplier;
import com.project.fleetmanagement.vehicle.Vehicle;
import java.util.Date;
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
@Table(name = "vehicle_maintenances")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "vehicleMaintenanceId")
public class VehicleMaintenance extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleMaintenanceId;

    private String price;

    private String remarks;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", insertable = false, updatable = false)
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "supplier_id", insertable = false, updatable = false)
    private Supplier supplier;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        VehicleMaintenance that = (VehicleMaintenance) o;
        return vehicleMaintenanceId != null && Objects.equals(vehicleMaintenanceId, that.vehicleMaintenanceId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
