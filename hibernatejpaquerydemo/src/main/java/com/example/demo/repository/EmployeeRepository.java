package com.example.demo.repository;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Department;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e WHERE e.salary > :salary")
    List<Employee> findHighEarners(@Param("salary") double salary);

    @Query(value = "SELECT * FROM employee WHERE salary < ?1", nativeQuery = true)
    List<Employee> findLowEarners(double salary);

    @Query("SELECT COUNT(e) FROM Employee e WHERE e.salary > :salary")
    long countHighEarners(@Param("salary") double salary);

    @Query("SELECT d FROM Department d JOIN FETCH d.employees")
    List<Department> fetchDepartmentsWithEmployees();
}