package com.bellinfo.advanced.hibernate.crud;

import com.bellinfo.advanced.hibernate.entity.Product;
import com.bellinfo.advanced.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DemoSelect {

    public static void main(String[] args) {



        SessionFactory sf = HibernateUtil.newSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();

        Product prod = s.get(Product.class,10);
        System.out.println(prod.getCost());

        s.close();
        sf.close();


    }

}
