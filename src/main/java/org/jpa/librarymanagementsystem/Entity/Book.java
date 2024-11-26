package org.jpa.librarymanagementsystem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jpa.librarymanagementsystem.Enums.Genre;

import java.util.List;

@Entity
@Table(name="book")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String title;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    private int numberOfPages;

    private int prices;

    @ManyToOne
    @JoinColumn
    Author author;



}
