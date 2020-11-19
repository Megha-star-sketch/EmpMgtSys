package com.empMgtSys.empMgtSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empMgtSys.empMgtSystem.Dao.EmployeeDao;
import com.empMgtSys.empMgtSystem.Model.Employee;
@Service
public class EmpService {
	
	@Autowired
	private EmployeeDao dao1;
	
	public List<Employee> getAll()
	{
		return dao1.findAll();
	}
	public String getByName(String name)
	{
		return dao1.getByName(name);
	}
	public Employee getById(long id)
	{
		
		Optional<Employee> optional= dao1.findById(id);
		Employee employee=null;
		if(optional.isPresent())
		{
			employee=optional.get();
		}
		else
		{
			throw new RuntimeException("Employee not found for Id  : "+id);
		}
		return employee;
	}
	public Employee create(Employee emp)
	{
		return dao1.save(emp);
	}
	public Employee deletaAll(Employee emp)
	{
		 dao1.deleteAll();
		 return emp;
	}
	public void deleteById(long id)
	{
		dao1.deleteById(id);
	}
}
