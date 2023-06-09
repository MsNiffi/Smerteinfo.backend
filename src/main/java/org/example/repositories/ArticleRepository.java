package org.example.repositories;

import org.example.models.enteties.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
    List<Article> findAll();
    List<Article> findAllByAuthor(String author);
}
