package com.project.fleetmanagement.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.project.fleetmanagement._model.Person;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
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
@Entity
@Table(name = "employees")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "person_id")
public class Employee extends Person {

    private String photo;

    private String username;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hireDate;

    @ManyToOne
    @JoinColumn(name = "employee_type_id", insertable = false, updatable = false)
    private EmployeeType employeeType;

    @ManyToOne
    @JoinColumn(name = "job_title_id", insertable = false, updatable = false)
    private JobTitle jobTitle;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Employee employee = (Employee) o;
        return getPersonId() != null && Objects.equals(getPersonId(), employee.getPersonId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
