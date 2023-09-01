package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.BookRepo;
import com.example.demo.Model.Book;

@Service
public class BookService {

	@Autowired
	BookRepo sr;
	public Book saveinfo(Book ss)
	{
		return sr.save(ss);
	}
	public List<Book> showinfo(){
		return sr.findAll();
	}
	public Book changeinfo(Book ss) {
		return sr.saveAndFlush(ss);
	}
	public void deleteinfo(Book ss) {
		sr.delete(ss);
	}
}

