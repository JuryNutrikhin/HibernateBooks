package org.example.model;

import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "book")
@Entity
@Data
@NoArgsConstructor
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name ="book_id")
    private int id;

@Column(name ="title")
    private String title;

@ManyToOne
@JoinColumn(name="author_id",referencedColumnName ="author_id")
    private Author author;

@ManyToOne
@JoinColumn(name ="genre_id",referencedColumnName ="genre_id")
    private Genre genre;

@Column(name =" price")
    private double price ;

@Column(name ="amount")
    private int amount;

    public Book(String title, Author author, Genre genre, double price, int amount) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.amount = amount;
    }
}
