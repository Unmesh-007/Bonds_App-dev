package com.BondApplication.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BondApplication.Models.Books;

public interface BooksRepository  extends JpaRepository<Books , Long>{

}
