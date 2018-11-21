package com.bellinfo.advanced.hibernate.criteriaqueris;

import com.bellinfo.advanced.hibernate.util.HibernateUtil;
import com.bellinfo.advanced.hibernate.entity.Product;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class CriteriaSelectDemo {

    public static void main(String[] args) {

        SessionFactory sf = HibernateUtil.newSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();

        Criteria c = s.createCriteria(Product.class);

        Projection p = Projections.property("name");
        Criterion cr = Restrictions.gt("id", 2);
        c.setProjection(p);
        c.add(cr);

        List<String> list = c.list();
        for(String x:list)
            System.out.println(x);

        s.close();
        sf.close();




    }
}
