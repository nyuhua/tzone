package com.icike.it.article.comment.testcomment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.google.gson.Gson;
import com.icike.it.article.articleContent.vo.Article;
import com.icike.it.article.comment.vo.Comment;
import com.icike.it.article.comment.vo.CommentNode;

public class CommentTreeTest {

	public CommentNode getTreeThroughRoot(CommentNode node , Set<Comment> commentSet){
		CommentNode currentNode =  node;
		while(!commentSet.isEmpty()){
			Iterator<Comment> iterator = commentSet.iterator();
			Set<Comment> subSet = new HashSet<Comment>();
			while(iterator.hasNext()){
				Comment newComment = iterator.next();
				if(currentNode.getCommentVo().getId().equals(newComment.getPrev_comment_id())){
					CommentNode commentNode = new CommentNode();
					commentNode.setCommentVo(newComment);
					currentNode.addSubNode(commentNode);
					subSet.add(newComment);
				}
			}
			commentSet.removeAll(subSet);
			if(currentNode.getFirstNode() ==  null){
				return currentNode;
			}
			else{
				Iterator<CommentNode> iterat = currentNode.getSubCommentList().iterator();
				while(iterat.hasNext()){
					CommentNode commentNode = iterat.next();
					getTreeThroughRoot(commentNode, commentSet);
				}
				return currentNode;
			}
			
		}
		return currentNode;
	}
	
	public static void main(String[] args){
		Gson gson = new Gson();
		Article article = new Article();
		article.setAuthor_id("73894");
		article.setAuthor_nickname("Ð¡Ã÷");
		article.setCategory_id("68763847");
		article.setComment_state(1);
		article.setContent("ÎÄÕÂ");
		article.setState(0);
		CommentTreeTest commentTreeTest = new CommentTreeTest();
		CommentNode root = new CommentNode();
		Comment rootComment = new Comment();
		rootComment.setId("123456789");
		root.setCommentVo(rootComment);
		commentTreeTest.getTreeThroughRoot(root, new CommentBuilder().getCommentSet());
		article.setCommentList(root.getSubCommentList());
		try{
			String rootStr = gson.toJson(article);
			System.out.println(rootStr);
		}catch(Exception e){
			
		}

	}
}
