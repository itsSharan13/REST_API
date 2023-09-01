package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Child;
import com.example.demo.Service.ChildService;

@RestController
public class ApiController {
	@Autowired
	
	ChildService sser;
	@PostMapping("addChild")
	public Child add(@RequestBody Child ss)
	{
		return sser.saveinfo(ss);
		
	}
	@PostMapping("addnChild")
	public List<Child>addndetails(@RequestBody List<Child>ss){
		return sser.savedetails(ss);
	}
	@GetMapping("showdetails")
	public List<Child> show()
	{
		return sser.showinfo();
	}
	@GetMapping("sort/{name}")
	public List<Child> getsortinfo(@PathVariable String name)
	{
		return sser.sortinfo(name);
	}
	@GetMapping("paging/{pageno}/{pagesize}")
	public List<Child> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize)
	{
		return sser.getbypage(pageno, pagesize);
	}
	@PutMapping("update")
	public Child modify(@RequestBody Child ss) {
		return sser.changeinfo(ss);
	}
	@DeleteMapping("deletedetail")
	public String del(@RequestBody Child ss) {
		sser.deleteinfo(ss);
		return "Deleted Successfully";
	}
	
	@DeleteMapping("deleteid")
	public String deletemyid(@PathVariable int id)
	{
		sser.deleteid(id);
		return "id deleted";
	}
	@DeleteMapping("deleteparamid")
	public String deletepid(@RequestParam int id)
	{
		sser.deleteid(id);
		return "id deleted";
	}
	
	
}
