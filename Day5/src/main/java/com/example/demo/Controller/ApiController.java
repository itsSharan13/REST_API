package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Book;
import com.example.demo.Service.BookService;

@RestController
public class ApiController {
	@Autowired
	
	BookService sser;
	@PostMapping("addBook")
	public Book add(@RequestBody Book ss)
	{
		return sser.saveinfo(ss);
		
	}
	@GetMapping("BookList")
	public List<Book> show()
	{
		return sser.showinfo();
	}
	@PutMapping("update")
	public Book modify(@RequestBody Book ss) {
		return sser.changeinfo(ss);
	}
	@DeleteMapping("delete")
	public String del(@RequestBody Book ss) {
		sser.deleteinfo(ss);
		return "Deleted Successfully";
	}
}
