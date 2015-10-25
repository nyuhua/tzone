package com.icike.it.article.articleContent.dao;


import org.springframework.stereotype.Component;

import com.icike.it.article.articleContent.vo.Article;
import com.icike.it.common.util.IcikeDaoSuperInterface;

@Component
@IcikeDaoSuperInterface
public interface ArticleDao {
	public Article getArticleById(String id) throws Exception;
}
