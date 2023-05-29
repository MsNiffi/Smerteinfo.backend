package org.example;

import org.example.services.ArticleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmerteInfoApplication {

private final ArticleService articleService;


public SmerteInfoApplication (ArticleService articleService){
    this.articleService = articleService;
}

    public static void main(String[] args) {
        SpringApplication.run(SmerteInfoApplication.class, args);
    }
}