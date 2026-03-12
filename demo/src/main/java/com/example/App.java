package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

        SessionFactory factory =
                new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Book.class)
                        .addAnnotatedClass(User.class)
                        .addAnnotatedClass(Blog.class)
                        .addAnnotatedClass(Comment.class)
                        .buildSessionFactory();

        try (Session session = factory.openSession()) {
            session.beginTransaction();

            User user = new User("Laxman");
            session.persist(user);

            
            Blog blog = new Blog("Hibernate Tutorial","This is a tutorial on Hibernate.", user);
            session.persist(blog);

            Comment comment = new Comment(user, blog, "This is a great tutorial!");
            session.persist(comment);

            session.getTransaction().commit();
        } finally {
            factory.close();
        }

        System.out.println("Data inserted successfully");
    }
}