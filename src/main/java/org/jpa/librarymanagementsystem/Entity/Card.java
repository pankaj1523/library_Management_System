package org.jpa.librarymanagementsystem.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.jpa.librarymanagementsystem.Enums.CardStatus;

import java.util.Date;

@Entity
@Table(name="card")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @CreationTimestamp
    private Date issueDate;

    @Enumerated(EnumType.STRING)
    private CardStatus cardStatus;

    private Date validTill ;

    @OneToOne
    @JoinColumn
    Student student;


}
