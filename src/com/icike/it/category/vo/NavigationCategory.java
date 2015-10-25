package com.icike.it.category.vo;

public class NavigationCategory {
	private String id;
	private String title;
	private int level;
	private String father_category_id;
	
	
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
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getFather_category_id() {
		return father_category_id;
	}
	public void setFather_category_id(String father_category_id) {
		this.father_category_id = father_category_id;
	}
	
}
