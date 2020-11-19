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

import com.empMgtSys.empMgtSystem.Model.Role;
import com.empMgtSys.empMgtSystem.Service.RoleService;

@RestController
@RequestMapping("/Role")
public class RoleController {

		@Autowired
		private RoleService service;
		
	@GetMapping("/getAll")
	public List<Role> getAllRole()
	{
		return service.getAll();
	}
	@GetMapping("/GetRole/{id}")
	public Role getRoleById(@PathVariable long id)
	{
		return service.getById(id);
	}
	@PostMapping("/addRole")
	public Role createRole(@RequestBody Role role)
	{
		return service.create(role);
	}
	@DeleteMapping("/DeleteRole")
	public Role deleteAll(@RequestBody Role role)
	{
		return service.deletaAll(role);
	}
	@DeleteMapping("/DeleteMapping/{id}")
	public void deleteRoleById(@PathVariable long id)
	{
		 service.deleteById(id);
	}
}
