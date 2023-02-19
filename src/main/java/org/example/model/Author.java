package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "author")
@Entity
@Data
@NoArgsConstructor
public class Author {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "author_id")
    private int id;

 @Column(name = "name_author")
    private String name;

 @OneToMany(mappedBy = "author" )
    private List<Book> books;

 public Author(String name){this.name = name;}

}
