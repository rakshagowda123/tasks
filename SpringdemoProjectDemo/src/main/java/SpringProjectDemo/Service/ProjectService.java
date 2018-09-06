package SpringProjectDemo.Service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProjectDemo.Model.Employee;
import SpringProjectDemo.Model.Project;
import SpringProjectDemo.Repository.ProjectRepository;

@Service
@Transactional
public class ProjectService {
	
	@Autowired
	private  ProjectRepository ProjectRepository;
	
public ProjectService() {
		
	}
	
	public ProjectService(ProjectRepository ProjectRepository) {
		this.ProjectRepository= ProjectRepository;
	}
	
	
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		
		List<Project> p =new ArrayList();
	 ProjectRepository.findAll()
		.forEach(p::add);
		return p;
	
	}
	

}
