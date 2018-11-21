package com.bellinfo.advanced.hibernate.util;

import com.bellinfo.advanced.hibernate.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class HibernateUtil {


    public static SessionFactory newSessionFactory() {

        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        properties.put("hibernate.hbm2ddl.auto", "update");
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.connection.driver_class", "org.postgresql.Driver");
        properties.put("hibernate.connection.url", "jdbc:postgresql://127.0.0.1:5433/belljavasep");
        properties.put("hibernate.connection.username", "postgres");
        properties.put("hibernate.connection.password", "abcd12345");
        properties.put("hibernate.default_schema", "learning");

        return new Configuration()
                .addProperties(properties)
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Cheque.class)
                .addAnnotatedClass(CreditCard.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Professor.class)
                .addAnnotatedClass(Car.class)
                .addAnnotatedClass(Bike.class)
                .buildSessionFactory(
                        new StandardServiceRegistryBuilder()
                                .applySettings(properties)
                                .build()
                );
    }


}
