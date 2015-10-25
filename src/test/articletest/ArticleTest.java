package test.articletest;

import org.junit.Test;

import com.icike.it.article.articleContent.business.ArticleManager;
import com.icike.it.article.articleContent.vo.Article;


public class ArticleTest {
	ArticleManager articleManager = new ArticleManager();
	@Test
	public void getArticleTest(){
		String articleId = "123456789";
		Article article = null;
		try {
			article = articleManager.doGetArticleById(articleId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
