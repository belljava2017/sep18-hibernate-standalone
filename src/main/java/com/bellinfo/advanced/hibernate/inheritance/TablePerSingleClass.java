package com.bellinfo.advanced.hibernate.inheritance;

import com.bellinfo.advanced.hibernate.entity.*;
import com.bellinfo.advanced.hibernate.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TablePerSingleClass {

    public static void main(String[] args) {

        SessionFactory sf = null;
        Session s = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.newSessionFactory();
            s = sf.openSession();
            tx = s.beginTransaction();

            Person p3 = new Student("Raj", "Java&J2ee", 000);
            s.save(p3);

            Person p2 = new Professor("Malli", "Dean", 5000);
            s.save(p2);

            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            sf.close();
        }





    }
}
