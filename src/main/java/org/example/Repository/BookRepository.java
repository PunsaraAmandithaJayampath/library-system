package org.example.Repository;

import org.example.Entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookEntity , Long> {

}
