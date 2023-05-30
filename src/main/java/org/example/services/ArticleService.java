package org.example.services;

import org.example.models.enteties.Article;
import org.example.repositories.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

public List<Article> findAllByAuthor (String author){
        return articleRepository.findAllByAuthor(author);

}



}
