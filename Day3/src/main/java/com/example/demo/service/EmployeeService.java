package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeRepo;
import com.example.demo.model.Employee;
@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo sr;
	public Employee saveinfo(Employee ss)
	{
		return sr.save(ss);
	}
	public List<Employee> showinfo()
	{
		return sr.findAll();
	}
}
