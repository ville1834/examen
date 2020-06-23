package com.example.demo.dao;

import com.example.demo.model.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleDAO extends CrudRepository<Article, Long> {

}
