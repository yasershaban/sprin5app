package com.course.spring5app.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.spring5app.modell.Author;

public interface AuthorRepo extends JpaRepository<Author, Long> {

}
