package com.example.demo.controller;

import com.example.demo.exception.ModelNotFoundException;
import com.example.demo.model.Article;
import com.example.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @PostMapping("/save")
    public long save(@RequestBody Article article) {
        articleService.save(article);
        return article.getId();
    }

    @GetMapping("/listAll")
    public Iterable<Article> listAllArticles() {
        return articleService.list();
    }

    @GetMapping("/list/{id}")
    public Article listArticleById(@PathVariable("id") int id) {
        Optional<Article> articles = articleService.listId(id);
        if(articles.isPresent()) {
            return articles.get();
        }
        throw new ModelNotFoundException("Invalid find person provided");
    }
}
