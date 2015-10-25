package com.icike.it.article.comment.testcomment;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.icike.it.article.comment.vo.Comment;

public class CommentBuilder {
	private Set<Comment> CommentSet;
	public CommentBuilder(){
		this.CommentSet = new HashSet<Comment>();
		Long timel = new Date().getTime();
		
		Comment comment = new Comment();
		comment.setId("1234");
		comment.setArticle_id("123456789");
		comment.setCommenter_id("12345678");
		comment.setCreate_time(new Timestamp(timel));
		comment.setPrev_comment_id("1234567890");
		comment.setContent("这是第二条评论的回复");
		this.CommentSet.add(comment);
		
		Comment comment1 = new Comment();
		comment1.setId("1234567890");
		comment1.setArticle_id("123456789");
		comment1.setCommenter_id("12345678");
		comment1.setCreate_time(new Timestamp(timel));
		comment1.setPrev_comment_id("12345678900");
		comment1.setContent("这是第一条评论的回复");
		this.CommentSet.add(comment1);
		
		
		Comment comment2 = new Comment();
		comment2.setId("12345678900");
		comment2.setArticle_id("123456789");
		comment2.setCommenter_id("12345678");
		comment2.setCreate_time(new Timestamp(timel));
		comment2.setPrev_comment_id("123456789");
		comment2.setContent("你好，这是文章第一条评论");
		this.CommentSet.add(comment2);
		
		Comment comment3 = new Comment();
		comment3.setId("123456789000");
		comment3.setArticle_id("123456789");
		comment3.setCommenter_id("12345678");
		comment3.setCreate_time(new Timestamp(timel));
		comment3.setPrev_comment_id("123456789");
		comment3.setContent("你好，这是文章第二条评论");
		this.CommentSet.add(comment3);
	
	}
	
	public Set<Comment> getCommentSet(){
		return this.CommentSet;
		
	}
}
