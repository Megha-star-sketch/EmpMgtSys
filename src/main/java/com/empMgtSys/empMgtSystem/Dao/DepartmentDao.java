package com.empMgtSys.empMgtSystem.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.empMgtSys.empMgtSystem.Model.Department;
@Repository
public interface DepartmentDao extends MongoRepository<Department, Long>{

}
