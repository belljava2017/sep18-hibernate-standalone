package com.bellinfo.advanced.hibernate.crud;

import com.bellinfo.advanced.hibernate.entity.Product;
import com.bellinfo.advanced.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DemoUpdate {
    public static void main(String[] args) {




        SessionFactory sf = HibernateUtil.newSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Product prod = session.get(Product.class, 1);
        prod.setName("APPLE NEW");
        session.update(prod);
        tx.commit();
        session.close();
        sf.close();







    }
}
