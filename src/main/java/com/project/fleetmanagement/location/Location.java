package com.project.fleetmanagement.location;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.project.fleetmanagement.country.Country;
import com.project.fleetmanagement.state.State;
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

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "locations")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "locationId")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationId;

    private String description;

    private String details;

    private String city;

    private String address;

    @ManyToOne
    @JoinColumn(name = "country_id", insertable = false, updatable = false)
    private Country country;

    @ManyToOne
    @JoinColumn(name = "state_id", insertable = false, updatable = false)
    private State state;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Location location = (Location) o;
        return locationId != null && Objects.equals(locationId, location.locationId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
