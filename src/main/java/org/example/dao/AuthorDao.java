package org.example.dao;

import org.example.model.Author;

public interface AuthorDao {
    Author getById(int id);
    Author getByName(String title);
    void delete(int id);
    void save(Author author);

    //Любой запрос, касающийся автора идёт сюда.
}
