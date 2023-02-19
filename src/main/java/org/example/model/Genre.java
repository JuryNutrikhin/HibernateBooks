package org.example.model;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Table
@Entity
@Data
@NoArgsConstructor


public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="genre_id")
    private int id;

    @Column(name = "name_genre")
    private String name;

    @OneToMany(mappedBy = "genre")
    private List<Book> books;
}
