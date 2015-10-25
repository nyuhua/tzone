package com.icike.it.article.articleContent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.icike.it.article.articleContent.business.ArticleManager;
import com.icike.it.article.articleContent.vo.Article;

@Controller
public class ArticleService {
	@Autowired
	public ArticleManager articleManager;
	
	@RequestMapping(value="/article.do")
	public ModelAndView getArticleInfoById(String articleId){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		try {
			Gson gson = new Gson();
			Article article = articleManager.doGetArticleById(articleId);
			System.out.println(gson.toJson(article));
			modelAndView.addObject("article",gson.toJson(article));
			modelAndView.setViewName("public/article");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelAndView;
	}
}
