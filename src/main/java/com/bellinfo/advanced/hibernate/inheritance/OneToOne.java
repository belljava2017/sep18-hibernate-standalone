package com.bellinfo.advanced.hibernate.inheritance;

import com.bellinfo.advanced.hibernate.entity.Cart;
import com.bellinfo.advanced.hibernate.entity.Detail;
import com.bellinfo.advanced.hibernate.entity.Employee;
import com.bellinfo.advanced.hibernate.entity.Items;
import com.bellinfo.advanced.hibernate.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class OneToOne {
    public static void main(String[] args) {
        SessionFactory sf = null;
        Session s = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.newSessionFactory();
            s = sf.openSession();
            tx = s.beginTransaction();

            Detail d = new Detail(1090, 12212121, "terling");

            Employee e1 = new Employee("Mohan1",d);
            s.save(d);
            s.save(e1);

            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            sf.close();
        }


    }

}
