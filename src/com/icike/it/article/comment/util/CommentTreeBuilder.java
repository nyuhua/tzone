package com.icike.it.article.comment.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.icike.it.article.comment.vo.Comment;
import com.icike.it.article.comment.vo.CommentNode;

public class CommentTreeBuilder{
	/**
	 * 
	 * @param node ��һ��ִ�и÷���Ӧ�ô����Ǹ��ڵ㡣���ڵ�Ӧ�ø�������id�����졣
	 * @param commentSet  �����ݿ��ȡ ������ص��������ۼ�¼��
	 * @return root node reference
	 */
	public synchronized static CommentNode getTreeThroughRoot(CommentNode node , Collection<Comment> commentSet){
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
}
