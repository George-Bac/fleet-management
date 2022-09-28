package com.project.fleetmanagement.client;

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
@Table(name = "clients")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "clientId")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String name;

    private String address;

    private String city;

    private String phone;

    private String mobile;

    private String website;

    private String email;

    private String details;

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
        Client client = (Client) o;
        return clientId != null && Objects.equals(clientId, client.clientId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
