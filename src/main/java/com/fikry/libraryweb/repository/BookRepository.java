package com.fikry.libraryweb.repository;

import com.fikry.libraryweb.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface BookRepository extends JpaRepository<Book, Long> {
    
    @SuppressWarnings("null")
    @Override
    <S extends Book> S save(S entity);

    @SuppressWarnings("null")
    @Override
    Optional<Book> findById(Long id);

    @SuppressWarnings("null")
    @Override
    List<Book> findAll();

    @SuppressWarnings("null")
    @Override
    void deleteById(Long id);

}