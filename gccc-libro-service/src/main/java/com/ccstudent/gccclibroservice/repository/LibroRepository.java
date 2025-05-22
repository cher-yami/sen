package com.ccstudent.gccclibroservice.repository;

import com.ccstudent.gccclibroservice.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
