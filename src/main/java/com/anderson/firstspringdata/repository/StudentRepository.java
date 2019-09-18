package com.anderson.firstspringdata.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.anderson.firstspringdata.entity.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

}
