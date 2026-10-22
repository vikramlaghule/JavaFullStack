package com.ganesh.courier;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface EmployeeRepo extends JpaRepository<Employee, Long> { Optional<Employee> findByUsername(String u); }
