package com.mp.util;




import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static SessionFactory sessionFactory; // Настройка работы с сессиями

    static {

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder() //получение реестра сервиса
                .configure() // настройка из hibernate.cfg.xml
                .build();

        try {
            // MetadataSource для работы с маппинга объекта
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

        }

        catch (Exception e){
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

}