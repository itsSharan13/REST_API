package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ChildRepo;
import com.example.demo.Model.Child;

@Service
public class ChildService {

	@Autowired
	ChildRepo sr;
	public Child saveinfo(Child ss)
	{
		return sr.save(ss);
	}
	public List<Child> savedetails(List<Child>ss){
		return (List<Child>) sr.saveAll(ss);
	}
	public List<Child> showinfo(){
		return sr.findAll();
	}
	public Child changeinfo(Child ss) {
		return sr.saveAndFlush(ss);
	}
	public void deleteinfo(Child ss) {
		sr.delete(ss);
	}
	//delete by id for pathvariable
	public void deleteid(int id) {
		sr.deleteById(id);
	}
	//delete by id for requestparam
	public void deletepid(int id) {
		sr.deleteById(id);
	}
	//sorting
	public List<Child> sortinfo(String s)
	{
		return sr.findAll(Sort.by(Sort.Direction.DESC,s));
	}
	//paging
	public List<Child> getbypage(int pgno,int pgsize)

    {
		Page<Child> p=sr.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
    }
}
