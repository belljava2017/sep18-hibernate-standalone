package com.bellinfo.advanced.hibernate.inheritance;

import com.bellinfo.advanced.hibernate.entity.Bike;
import com.bellinfo.advanced.hibernate.entity.Cart;
import com.bellinfo.advanced.hibernate.entity.Items;
import com.bellinfo.advanced.hibernate.entity.Vehicle;
import com.bellinfo.advanced.hibernate.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class OneToMany {

    public static void main(String[] args) {
        SessionFactory sf = null;
        Session s = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.newSessionFactory();
            s = sf.openSession();
            tx = s.beginTransaction();

            Cart cart1 = new Cart("Walmart");

            Items item1 = new Items("Laptop",200,cart1);
            Items item2 = new Items("IPad",400,cart1);
            Set<Items> itemsSet = new HashSet<Items>();
            itemsSet.add(item1);
            itemsSet.add(item2);
            cart1.setItems(itemsSet);

            s.save(cart1);
            s.save(item1);
            s.save(item2);


            Cart cart2 = new Cart("Costco");

            Items item3 = new Items("Milk",20,cart2);
            Items item4 = new Items("GarageDoor",4000,cart2);
            Set<Items> itemsSet2 = new HashSet<Items>();
            itemsSet2.add(item3);
            itemsSet2.add(item4);
            cart2.setItems(itemsSet2);

            s.save(cart2);
            s.save(item3);
            s.save(item4);

            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
            sf.close();
        }





    }
}
