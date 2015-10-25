<%@ page language="java" import="java.util.*,com.icike.it.article.articleContent.vo.Article" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'article.jsp' starting page</title>
    <script type="text/javascript" src="<%=basePath%>js/common/jquery-1.11.3.js"></script>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div class="article" style="width:80%;padding:0;margin-left:auto;margin-right:auto;">
    	<div id="content_div" class="content" >
    	</div>
    	<div id="comment_area_div" class="comment_area">
    		<!-- <div>第一条评论
    			<div>第一条评论子评论
    				<div>第一条评论子评论子评论一</div>
    			</div>
    			<div>第一条评论子评论二</div>
    		</div>
    		<div>
    			第二条评论
    			<div>第二条评论子评论一</div>
    			<div>第二条评论子评论二</div>
    		</div> -->
    	</div>
    </div>
    <% 
    	Enumeration e = request.getAttributeNames();
    	while(e.hasMoreElements()){
    		System.out.println(e.nextElement().toString());
    	}
    %>
    <script>
    	function buildCommentTree(commentlist, treeNode){
    		for(var index in commentlist){
    			var commentvo = commentlist[index]["commentVo"];
    			var subcommentlist = commentlist[index]["subCommentList"];
    			var newnode = $("<div>").html(commentvo["content"]);
    			$(treeNode).append(newnode);
    			if(subcommentlist.length > 0){
    				buildCommentTree(subcommentlist,newnode);
    			}
    		}
    		return treeNode;
    	};
    </script>
    <script type="text/javascript">
    	var result = ${article};
    	var article_commentlist = result.CommentList;
    	var articleHtml = "<div class='article_title'>"+result.title+"</div><div>"+result.content+"</div>";
    	$("#content_div").html(articleHtml);
    	var $root = buildCommentTree(article_commentlist, $("#comment_area_div"));
    	
    </script>
  </body>
  <style>
  #comment_area_div div{margin:20px;}
  #comment_area_div div div{margin:40px;}
  #comment_area_div div div div{margin:40px;}
  </style>
</html>
