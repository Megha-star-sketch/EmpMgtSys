package com.empMgtSys.empMgtSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empMgtSys.empMgtSystem.Model.Department;
import com.empMgtSys.empMgtSystem.Service.DeptService;

@RestController
@RequestMapping("/Department")
public class DeptController {

	@Autowired
	private DeptService service;
	@GetMapping("/getAll")
	public List<Department> getAllDepartment()
	{
		return service.getAll();
	}
	@GetMapping("/GetDepartment/{id}")
	public Department getDepartmentById(@PathVariable long id)
	{
		return service.getById(id);
	}
	@PostMapping("/addDepartment")
	public Department createEmp(@RequestBody Department dept)
	{
		return service.create(dept);
	}
	@DeleteMapping("/DeleteDepartment")
	public Department deleteAll(@RequestBody Department dept)
	{
		return service.deletaAll(dept);
	}
	@DeleteMapping("/DeleteMapping/{id}")
	public void deleteDepartmentById(@PathVariable long id)
	{
		 service.deleteById(id);
	}
}
