package com.icike.it.article.comment.vo;

import java.util.Iterator;
import java.util.LinkedList;


public class CommentNode {
	
	private Comment commentVo;
	private LinkedList<CommentNode> subCommentList = new LinkedList<CommentNode>();
	

	
	public Comment getCommentVo() {
		return commentVo;
	}

	public void setCommentVo(Comment commentVo) {
		this.commentVo = commentVo;
	}

	public void addSubNode(CommentNode subNode){
		this.subCommentList.add(subNode);
	}
	
	public Iterator<CommentNode> nextSubNode(){
		return this.subCommentList.iterator();
	}
	
	public CommentNode getFirstNode(){
		if(subCommentList.isEmpty())
			return null;
		return subCommentList.getFirst();
	}
	
	public LinkedList<CommentNode> getSubCommentList(){
		return this.subCommentList;
	}
}
