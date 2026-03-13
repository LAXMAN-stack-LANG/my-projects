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

       Book book = new Book("Java Programming", "manas", "Tech Publishers", false);
       session.save(book);

       session.getTransaction().commit();

       session.close();
       factory.close();
       

       if (s1.equalsIgnoreCase(book.getTitle())) {
           System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor() + ", published by " + book.getPublisher() + ", issued: " + book.isIssued());
       } else {
           System.out.println("Book not found");
       }

       System.out.println("Data inserted successfully");

   }
}