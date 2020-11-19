package com.empMgtSys.empMgtSystem.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.empMgtSys.empMgtSystem.Model.Employee;
@Repository
public interface EmployeeDao extends MongoRepository<Employee, Long> {
	
	@Query("{'name' : ?0}")
	String getByName(String name);
}
