package kz.kbtu.dbsample.repository;

import kz.kbtu.dbsample.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {}