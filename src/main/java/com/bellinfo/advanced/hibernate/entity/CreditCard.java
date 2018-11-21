package com.bellinfo.advanced.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class CreditCard  extends Payment{

    @Column
    String ccno;

    @Column
    String cvv;

    public CreditCard() {
    }

    public CreditCard(double amount, String ccno, String cvv) {
        super(amount);
        this.ccno = ccno;
        this.cvv = cvv;
    }

    public String getCcno() {
        return ccno;
    }

    public void setCcno(String ccno) {
        this.ccno = ccno;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "ccno='" + ccno + '\'' +
                ", cvv='" + cvv + '\'' +
                ", id=" + id +
                ", amount=" + amount +
                '}';
    }
}
