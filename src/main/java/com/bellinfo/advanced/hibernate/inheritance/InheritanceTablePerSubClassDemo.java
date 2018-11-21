package com.bellinfo.advanced.hibernate.inheritance;

import com.bellinfo.advanced.hibernate.entity.Cheque;
import com.bellinfo.advanced.hibernate.entity.CreditCard;
import com.bellinfo.advanced.hibernate.entity.Payment;
import com.bellinfo.advanced.hibernate.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class InheritanceTablePerSubClassDemo {

    public static void main(String[] args) {

        SessionFactory sf = null;
        Session s = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.newSessionFactory();
            s = sf.openSession();
            tx = s.beginTransaction();

            Payment p2 = new CreditCard(1200.00,"54545454554544323","333");
            Payment p3 = new Cheque(2000, "123456", 999999);
            s.save(p3);
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
