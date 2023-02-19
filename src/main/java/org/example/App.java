package org.example;

import org.example.model.Author;
import org.example.model.Book;
import org.example.model.Genre;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //  Configuration  cgf = new Configuration()
        Configuration cfg = new Configuration()
                .addAnnotatedClass(Author.class)
                .addAnnotatedClass(Book.class)
                .addAnnotatedClass(Genre.class);

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            Author author = session.get(Author.class,3);

            System.out.println("------------------------------------------------------------------------");

            System.out.println("Автор : "+author.getName());
            System.out.println("Написал книги : ");
            author.getBooks().forEach(book -> System.out.println("Книги: "+book.getTitle()));

            System.out.println("------------------------------------------------------------------------");

            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
        } finally {
            sessionFactory.close();
        }

    }
}
