package com.example;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
   public static void main(String[] args) {
   System.out.println("Enter a book name that you want to search:");
   String s1;
   try (Scanner sc = new Scanner(System.in)) {
       s1 = sc.nextLine();
   }
   SessionFactory factory =
           new Configuration()
           .configure("hibernate.cfg.xml")
           .addAnnotatedClass(Book.class)
           .buildSessionFactory();

       Session session = factory.openSession();

       session.beginTransaction();

       Order order1 = new Order(name:"boo");
       session.save(order1);

       session.getTransaction().commit();

       session.close();
       factory.close();
       

       if (s1.equalsIgnoreCase(order1.getTitle())) {
           System.out.println("Order found: " + order1.getTitle() + " by " + order1.getAuthor() + ", published by " + order1.getPublisher() + ", issued: " + order1.isIssued());
       } else {
           System.out.println("Order not found");
       }

       System.out.println("Data inserted successfully");

   }
}