package com.example.demo.service;

import com.example.demo.dao.ArticleDAO;
import com.example.demo.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    private ArticleDAO dao;

    public Article save(Article a) { return dao.save(a); }

    public Article update(Article a) { return dao.save(a); }

    public void delete(Article a) { dao.delete(a); }

    public Iterable<Article> list() { return dao.findAll(); }

    public Optional<Article> listId(long id) {
        return dao.findById(id);
    }

}
