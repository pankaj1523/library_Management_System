package org.jpa.librarymanagementsystem.Service.Impl;

import org.jpa.librarymanagementsystem.Entity.Author;
import org.jpa.librarymanagementsystem.Repository.AuthorRepository;
import org.jpa.librarymanagementsystem.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImp implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;
    @Override
    public String addAuthor(Author author) {
        authorRepository.save(author);
        return "Author added successfully";
    }
}
