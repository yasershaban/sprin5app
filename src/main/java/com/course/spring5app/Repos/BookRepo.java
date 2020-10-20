package com.course.spring5app.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.spring5app.modell.Book;

public interface BookRepo extends JpaRepository<Book, Long >{

}
