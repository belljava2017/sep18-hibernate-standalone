package com.bellinfo.advanced.hibernate.inheritance;

import com.bellinfo.advanced.hibernate.entity.Cheque;
import com.bellinfo.advanced.hibernate.entity.CreditCard;
import com.bellinfo.advanced.hibernate.entity.Payment;
import com.bellinfo.advanced.hibernate.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class InheritanceTablePerSubClassReadDemo {

    public static void main(String[] args) {

        SessionFactory sf = null;
        Session s = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.newSessionFactory();
            s = sf.openSession();
            tx = s.beginTransaction();

            CreditCard c = s.get(CreditCard.class,1);
            System.out.println(c);

            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            sf.close();
        }





    }
}
