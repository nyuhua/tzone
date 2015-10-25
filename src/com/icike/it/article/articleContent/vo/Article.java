package com.icike.it.article.articleContent.vo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.LinkedList;

import com.icike.it.article.comment.vo.CommentNode;

public class Article {
	
	private String id;
	private String title;
	private String content;
	private String author_id;
	private String author_nickname;
	private int comment_state;
	private int state;
	private String category_id;
	private Timestamp create_time;
	private HashSet<String> labels;
	private LinkedList<CommentNode> CommentList;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(String author_id) {
		this.author_id = author_id;
	}
	public String getAuthor_nickname() {
		return author_nickname;
	}
	public void setAuthor_nickname(String author_nickname) {
		this.author_nickname = author_nickname;
	}
	public int getComment_state() {
		return comment_state;
	}
	public void setComment_state(int comment_state) {
		this.comment_state = comment_state;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public HashSet<String> getLabels() {
		return labels;
	}
	public void setLabels(HashSet<String> labels) {
		this.labels = labels;
	}
	public LinkedList<CommentNode> getCommentList() {
		return CommentList;
	}
	public void setCommentList(LinkedList<CommentNode> commentList) {
		CommentList = commentList;
	}
	
	
	
}
