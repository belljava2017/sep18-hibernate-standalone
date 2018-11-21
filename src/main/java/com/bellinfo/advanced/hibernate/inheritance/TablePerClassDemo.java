package com.bellinfo.advanced.hibernate.inheritance;

import com.bellinfo.advanced.hibernate.entity.*;
import com.bellinfo.advanced.hibernate.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TablePerClassDemo {
    public static void main(String[] args) {

        SessionFactory sf = null;
        Session s = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.newSessionFactory();
            s = sf.openSession();
            tx = s.beginTransaction();

            //Vehicle v1 = new Car("bmw", 4);
            Vehicle v2 = new Bike("RX100", 100);
            s.save(v2);
            //s.save(v2);

            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            sf.close();
        }





    }

}
