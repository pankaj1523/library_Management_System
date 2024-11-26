package org.jpa.librarymanagementsystem.Repository;

import org.jpa.librarymanagementsystem.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
