package com.anandsankritya.springbootcrud.crud.repository;

import com.anandsankritya.springbootcrud.crud.entity.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
