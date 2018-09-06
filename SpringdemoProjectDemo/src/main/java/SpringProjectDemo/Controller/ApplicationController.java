package SpringProjectDemo.Controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import SpringProjectDemo.Model.Employee;
import SpringProjectDemo.Model.Project;
import SpringProjectDemo.Service.EmailService;
import SpringProjectDemo.Service.EmployeeService;
import SpringProjectDemo.Service.ProjectService;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class ApplicationController {
	
	@Autowired
	EmployeeService employeeService;
	@Autowired
	ProjectService projectService;
	
	

	@RequestMapping("/Start")
	public String StartPage(Model model) {
		
		return "StartPage";
	}
	
	@RequestMapping(value = "/register.htm", method = RequestMethod.GET)
	   public String RegisterPage() {
				
			return "Register";
		}
	
	@PostMapping("/save-Employee")
	public String registerUser(@RequestParam String firstname , @RequestParam String lastname, @RequestParam String email,@RequestParam String password, Model model) {
		Employee e = new Employee(firstname,lastname,email,password);
		employeeService.saveEmployee(e);
		model.addAttribute(firstname);
		model.addAttribute(lastname);
	    model.addAttribute(email);
		model.addAttribute(password);
		// Optional<Employee> e1 = employeeService.getOneEmployee(e.getId());
	        model.addAttribute("users", e);
	     // List<Project> Project =projectService.getAllProjects();
	      //model.addAttribute("pro",Project);
	        return "welcome";
	}
	
	
		
		
		
		
	}
	

