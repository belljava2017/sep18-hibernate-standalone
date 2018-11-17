package com.bellinfo.advanced.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateDemo {
    public static void main(String[] args) {


        Product prod = new Product();
        prod.setName("LENOVA");
        prod.setCost(1000);


        SessionFactory sf = HibernateUtil.newSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(prod);
        tx.commit();
        session.close();
        sf.close();







    }
}
