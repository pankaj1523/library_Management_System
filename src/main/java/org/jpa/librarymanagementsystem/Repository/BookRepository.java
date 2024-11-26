package org.jpa.librarymanagementsystem.Repository;

import org.jpa.librarymanagementsystem.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
