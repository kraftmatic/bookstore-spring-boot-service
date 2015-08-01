package com.kraftmatic.bookservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kraftmatic.bookservice.models.Book;

@Controller
@RequestMapping(value = "/book/")
public class BookstoreController {

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Book getBooks() {
		Book book = new Book("Eaters of the Dead", "Michael Crichton");
		return book;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Book> persistBook(@RequestBody Book book) {
		try {
			// do DAO stuff
		} catch (Exception e) {
			return new ResponseEntity<Book>(HttpStatus.BAD_GATEWAY);
		}
		return new ResponseEntity<Book>(book, HttpStatus.ACCEPTED);
	}

}
