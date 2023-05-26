package org.example.services;

import org.example.repositories.ArticleRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }





}
