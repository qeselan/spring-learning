package otaniyici.cruddemo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import otaniyici.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
