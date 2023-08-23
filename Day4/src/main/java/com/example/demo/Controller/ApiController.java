package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;

@RestController
public class ApiController {
	@Autowired
	
	StudentService sser;
	@PostMapping("addstudent")
	public Student add(@RequestBody Student ss)
	{
		return sser.saveinfo(ss);
		
	}
	@GetMapping("showdetails")
	public List<Student> show()
	{
		return sser.showinfo();
	}
	@PutMapping("update")
	public Student modify(@RequestBody Student ss) {
		return sser.changeinfo(ss);
	}
	@DeleteMapping("deletedetail")
	public String del(@RequestBody Student ss) {
		sser.deleteinfo(ss);
		return "Deleted Successfully";
	}
}
