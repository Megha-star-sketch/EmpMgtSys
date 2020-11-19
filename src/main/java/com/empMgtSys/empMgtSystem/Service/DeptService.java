package com.empMgtSys.empMgtSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empMgtSys.empMgtSystem.Dao.DepartmentDao;
import com.empMgtSys.empMgtSystem.Model.Department;
@Service
public class DeptService {
	@Autowired
	DepartmentDao dao;
	
	public List<Department> getAll()
	{
		return dao.findAll();
	}
	public Department getById(long id)
	{
		 Optional<Department> optional=dao.findById(id);
		 Department department=null;
		 if(optional.isPresent())
		 {
			 department=optional.get();
		 }
		 else
		 {
			 throw new RuntimeException("Department is not found for Id : "+id);
		 }
		 return department;
	}
	public Department create(Department dept)
	{
		return dao.save(dept);
	}
	public Department deletaAll(Department dept)
	{
		 dao.deleteAll();
		 return dept;
	}
	public void deleteById(long id)
	{
		dao.deleteById(id);
	}
}
