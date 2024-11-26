package org.jpa.librarymanagementsystem.Repository;

import org.jpa.librarymanagementsystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.security.Key;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
