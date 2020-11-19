package com.empMgtSys.empMgtSystem.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.empMgtSys.empMgtSystem.Model.Role;

@Repository
public interface RoleDao extends MongoRepository<Role, Long> {

}
