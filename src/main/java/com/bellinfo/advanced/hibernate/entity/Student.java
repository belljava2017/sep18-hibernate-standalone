package com.bellinfo.advanced.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "student")
public class Student extends Person{

    @Column
    String course;

    @Column
    double price;

    public Student() {
    }

    public Student(String name, String course, double price) {
        super(name);
        this.course = course;
        this.price = price;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course='" + course + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
