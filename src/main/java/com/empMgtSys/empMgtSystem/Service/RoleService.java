package com.empMgtSys.empMgtSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empMgtSys.empMgtSystem.Dao.RoleDao;
import com.empMgtSys.empMgtSystem.Model.Role;
@Service
public class RoleService {
	@Autowired
	private RoleDao dao;
	
	public List<Role> getAll()
	{
		return dao.findAll();
	}
	public Role getById(long id)
	{
		 Optional<Role> optional=dao.findById(id);
		 Role role=null;
		 if(optional.isPresent())
		 {
			 role=optional.get();
		 }
		 else
		 {
			 throw new RuntimeException("Role is not found for Id : "+id);
		 }
		 return role;
	}
	public Role create(Role role)
	{
		return dao.save(role);
	}
	public Role deletaAll(Role role)
	{
		 dao.deleteAll();
		 return role;
	}
	public void deleteById(long id)
	{
		dao.deleteById(id);
	}
}
