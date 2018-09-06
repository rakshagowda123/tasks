package SpringProjectDemo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import SpringProjectDemo.Model.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long>{
	
}