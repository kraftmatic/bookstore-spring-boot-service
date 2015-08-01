package com.kraftmatic.bookservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {

	private String title;
	private String author;

	public Book(@JsonProperty("title") String title,
			@JsonProperty("author") String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
