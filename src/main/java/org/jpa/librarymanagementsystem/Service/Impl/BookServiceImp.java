package org.jpa.librarymanagementsystem.Service.Impl;

import org.jpa.librarymanagementsystem.Entity.Author;
import org.jpa.librarymanagementsystem.Entity.Book;
import org.jpa.librarymanagementsystem.Repository.AuthorRepository;
import org.jpa.librarymanagementsystem.Repository.BookRepository;
import org.jpa.librarymanagementsystem.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImp implements BookService {

    @Autowired
    AuthorRepository authorRepository;
    @Override
    public String addBook(Book book) throws Exception {

        Author author;
        try {
            author = authorRepository.findById(book.getAuthor().getId()).get();
        }
        catch (Exception e){
            throw new Exception("Author not present");
        }

        author.getBooks().add(book);
        book.setAuthor(author);

        authorRepository.save(author);
        return "Book added";
    }
}
