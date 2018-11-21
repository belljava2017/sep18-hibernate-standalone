package com.bellinfo.advanced.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Car extends Vehicle {

    @Column
    int passCount;

    public Car() {
    }

    public Car(String name, int passCount) {
        super(name);
        this.passCount = passCount;
    }

    public int getPassCount() {
        return passCount;
    }

    public void setPassCount(int passCount) {
        this.passCount = passCount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "passCount=" + passCount +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
