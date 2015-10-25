package com.icike.it.article.comment.vo;

import java.sql.Timestamp;

public class Comment {
	private String id;
	private String content;
	private String article_id;
	private String commenter_id;
	private String prev_comment_id;
	private Timestamp create_time;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getArticle_id() {
		return article_id;
	}
	public void setArticle_id(String article_id) {
		this.article_id = article_id;
	}
	public String getCommenter_id() {
		return commenter_id;
	}
	public void setCommenter_id(String commenter_id) {
		this.commenter_id = commenter_id;
	}
	public String getPrev_comment_id() {
		return prev_comment_id;
	}
	public void setPrev_comment_id(String prev_comment_id) {
		this.prev_comment_id = prev_comment_id;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	
	
}
