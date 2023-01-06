package com.controller.info;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.book.info.Book;

public class Controller {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("book.xml");
		Book b1 = ctx.getBean(Book.class);
		System.out.println(b1);
	}

}
