package com.bellinfo.advanced.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Prof")
public class Professor extends Person{

    @Column
    String role;

    @Column
    double salary;

    public Professor() {
    }

    public Professor(String name, String role, double salary) {
        super(name);
        this.role = role;
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "role='" + role + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
