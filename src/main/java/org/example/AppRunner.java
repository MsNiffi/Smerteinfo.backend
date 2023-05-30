package org.example;

import org.example.services.ArticleService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;



public class AppRunner implements ApplicationRunner {
    private ArticleService articleService;


    public AppRunner (ArticleService articleService){
        this.articleService = articleService;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception{
        System.out.println(articleService.findAllByAuthor("Mr AA"));
    }
}
