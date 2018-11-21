package com.bellinfo.advanced.hibernate.hql;

import com.bellinfo.advanced.hibernate.entity.Product;
import com.bellinfo.advanced.hibernate.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class HQLdemo {

    public static void main(String[] args) {

        SessionFactory sf = null;
        Session s = null;
        try {
            sf = HibernateUtil.newSessionFactory();
            s = sf.openSession();
            Transaction tx = s.beginTransaction();

            //String select = "from ProductNew where cost<1000";
            //String select = "from ProductNew";
            //String select = "from ProductNew where name='AMAZON'";
            String select = "select avg(cost) from ProductNew";
            Query query = s.createQuery(select);
            //List<Product> pList = query.list();
            Double avgCost = (Double)query.uniqueResult();
            System.out.println(avgCost);
            /*for(Product p:pList){
                System.out.println(p);
            }
*/

        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            sf.close();
        }






    }
}
