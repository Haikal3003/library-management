package com.fikry.libraryweb.repository;

import com.fikry.libraryweb.entity.Book;
import com.fikry.libraryweb.entity.Loan;
import com.fikry.libraryweb.entity.Member;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {

    List<Loan> findByMember(Member member);

    Optional<Loan> findByBookAndReturnDateIsNull(Book book);
}
