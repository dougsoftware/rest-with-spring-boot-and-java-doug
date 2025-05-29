package com.douglasmatosdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<com.douglasmatosdev.model.Book, Long> {
}