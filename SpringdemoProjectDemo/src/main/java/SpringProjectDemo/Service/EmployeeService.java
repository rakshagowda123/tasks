package SpringProjectDemo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;



//import com.raksha.demoProject.topic.course.CourseRepository;

import SpringProjectDemo.Model.Employee;
import SpringProjectDemo.Repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	private EmployeeRepository EmployeeRepository;
	
	public EmployeeService() {
		
	}
	
	public EmployeeService(EmployeeRepository EmployeeRepository) {
		this.EmployeeRepository= EmployeeRepository;
	}
	

	public void saveEmployee(Employee emp) {
		EmployeeRepository.save(emp);
	}

	public List<Employee> getAllUsers() {
		// TODO Auto-generated method stub
		
		List<Employee> emp =new ArrayList();
		EmployeeRepository.findAll()
		.forEach(emp::add);
		return emp;
	
	}

	public Optional<Employee> getOneEmployee(Long id) {
		// TODO Auto-generated method stub
		return EmployeeRepository.findById(id);
	}
	
}
