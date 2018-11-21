package com.bellinfo.advanced.hibernate.entity;

import javax.persistence.Entity;

@Entity
public class Cheque extends Payment {

    String cheqno;

    int acctno;

    public Cheque() {
    }

    public Cheque(double amount, String cheqno, int acctno) {
        super(amount);
        this.cheqno = cheqno;
        this.acctno = acctno;
    }

    public String getCheqno() {
        return cheqno;
    }

    public void setCheqno(String cheqno) {
        this.cheqno = cheqno;
    }

    public int getAcctno() {
        return acctno;
    }

    public void setAcctno(int acctno) {
        this.acctno = acctno;
    }

    @Override
    public String toString() {
        return "Cheque{" +
                "cheqno='" + cheqno + '\'' +
                ", acctno=" + acctno +
                ", id=" + id +
                ", amount=" + amount +
                '}';
    }
}
