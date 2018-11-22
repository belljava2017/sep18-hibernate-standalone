package com.bellinfo.advanced.hibernate.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Detail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private double salary;

    @Column
    private int ssn;

    @Column
    private String address;

    public Detail() {
    }

    public Detail( double salary, int ssn, String address) {

        this.salary = salary;
        this.ssn = ssn;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", salary=" + salary +
                ", ssn=" + ssn +
                ", address='" + address + '\'' +
                '}';
    }
}
