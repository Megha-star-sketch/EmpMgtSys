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

import com.empMgtSys.empMgtSystem.Model.Employee;
import com.empMgtSys.empMgtSystem.Service.EmpService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Employee")
@Api(tags= {"Employee Data"})
public class EmpController {
	@Autowired
	private EmpService service;
	
	@ApiOperation(value="GetAllEmployee")
	@GetMapping("/Employee")
	public List<Employee> getAllUser()
	{
		return service.getAll();
	}
	@GetMapping("/get/{name}")
	public String getEmployeeByName(String name)
	{
		return service.getByName(name);
	}
	@GetMapping("/Employee/{id}")
	public Employee getEmployeeById(@PathVariable long id)
	{
		return service.getById(id);
	}
	@PostMapping("/add")
	public Employee createEmp(@RequestBody Employee emp)
	{
		return service.create(emp);
	}
	@DeleteMapping("/DeleteEmployee")
	public Employee deleteAll(@RequestBody Employee emp)
	{
		return service.deletaAll(emp);
	}
	@DeleteMapping("/DeleteMapping/{id}")
	public void deleteEmployeeById(@PathVariable long id)
	{
		 service.deleteById(id);
	}
}
