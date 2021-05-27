package com.getarrays.employeemanager.repo;

import com.getarrays.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
//    @Modifying
//    @Query(nativeQuery=true, value = "delete from employee where id = ?1")
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
