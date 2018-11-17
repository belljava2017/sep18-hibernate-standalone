package com.bellinfo.advanced.hibernate;

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

        return new Configuration()
                .addProperties(properties)
                .addAnnotatedClass(Product.class)
                .buildSessionFactory(
                        new StandardServiceRegistryBuilder()
                                .applySettings(properties)
                                .build()
                );
    }


}
