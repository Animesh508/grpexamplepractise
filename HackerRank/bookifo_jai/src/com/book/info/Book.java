package com.book.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.author.info.Author;

@Component

public class Book {
	@Value("${book_name}")
	private String book_name;

	@Value("${PageCount}")
	private Integer PageCount;

	@Value("${book_price}")
	private Double book_price;

	@Autowired
	private Author author;

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public Integer getPageCount() {
		return PageCount;
	}

	public void setPageCount(Integer pageCount) {
		PageCount = pageCount;
	}

	public Double getBook_price() {
		return book_price;
	}

	public void setBook_price(Double book_price) {
		this.book_price = book_price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [book_name=" + book_name + ", PageCount=" + PageCount + ", book_price=" + book_price + ", author="
				+ author + "]";
	}

}
