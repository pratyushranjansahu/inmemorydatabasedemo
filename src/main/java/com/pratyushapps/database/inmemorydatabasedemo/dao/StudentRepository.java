package com.pratyushapps.database.inmemorydatabasedemo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pratyushapps.database.inmemorydatabasedemo.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
