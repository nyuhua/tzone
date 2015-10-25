package com.icike.it.article.comment.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.icike.it.article.comment.vo.Comment;
import com.icike.it.common.util.IcikeDaoSuperInterface;

@Component
@IcikeDaoSuperInterface
public interface ICommentDao {
	
	public ArrayList<Comment> getCommentSetByArticleId(String articleId) throws Exception;
}
