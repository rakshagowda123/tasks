package SpringProjectDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import SpringProjectDemo.Model.Employee;
import SpringProjectDemo.Service.EmployeeService;

@RestController
public class sample {
	@Autowired
	EmployeeService service;
	

}
