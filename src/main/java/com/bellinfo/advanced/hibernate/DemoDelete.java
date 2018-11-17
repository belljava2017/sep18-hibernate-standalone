package com.bellinfo.advanced.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DemoDelete {

    public static void main(String[] args) {



        SessionFactory sf = HibernateUtil.newSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Product p1 =s.get(Product.class,2);
        System.out.println(p1);
        s.delete(p1);
        tx.commit();

        s.close();
        sf.close();


    }

}
