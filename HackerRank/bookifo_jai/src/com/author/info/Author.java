package com.author.info;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Author {
	@Value("${author_name}")
	private String author_name;

	@Value("${book_published}")
	private Integer book_published;

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public Integer getBook_published() {
		return book_published;
	}

	public void setBook_published(Integer book_published) {
		this.book_published = book_published;
	}

	@Override
	public String toString() {
		return "Author [author_name=" + author_name + ", book_published=" + book_published + "]";
	}

}
