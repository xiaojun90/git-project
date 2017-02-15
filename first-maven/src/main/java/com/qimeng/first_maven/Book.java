package com.qimeng.first_maven;

public class Book {
	
	/**
	 * 书名
	 */
	private String name;
	
	/**
	 * 作者
	 */
	private String autor;
	
	/**
	 * 售价
	 */
	private String price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}
