package com.icike.it.article.articleContent.business;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.icike.it.article.articleContent.dao.ArticleDao;
import com.icike.it.article.articleContent.vo.Article;
import com.icike.it.article.comment.dao.ICommentDao;
import com.icike.it.article.comment.util.CommentTreeBuilder;
import com.icike.it.article.comment.vo.Comment;
import com.icike.it.article.comment.vo.CommentNode;

@Component
public class ArticleManager {
	@Autowired
	public ArticleDao articleDao;
	@Autowired
	public ICommentDao commentDao;
	public Article doGetArticleById(String id) throws Exception{
		//step1 根据id获取 文章主要内容。
		Article article = articleDao.getArticleById(id);
		
		//step2 根据文章id 获取文章的相关评论，然后两者整合，返回文章对象。
		CommentNode rootNode = new CommentNode();
		Comment articleRootComment = new Comment();
		if(null == article){
			throw new Exception();
		}
		ArrayList<Comment> commentList = commentDao.getCommentSetByArticleId(id);
		if(null == commentList)
			return article;
		articleRootComment.setId(article.getId());
		rootNode.setCommentVo(articleRootComment);
		CommentTreeBuilder.getTreeThroughRoot(rootNode, commentList);
		article.setCommentList(rootNode.getSubCommentList());
		return article;
	}
}
