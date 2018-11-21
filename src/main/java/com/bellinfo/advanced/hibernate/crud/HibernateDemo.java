package com.bellinfo.advanced.hibernate.crud;

import com.bellinfo.advanced.hibernate.entity.Product;
import com.bellinfo.advanced.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateDemo {
    public static void main(String[] args) {


        Product prod = new Product();
        prod.setName("AMAZON");
        prod.setCost(500);


        SessionFactory sf = HibernateUtil.newSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(prod);
        tx.commit();
        session.close();
        sf.close();







    }
}
