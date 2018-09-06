package SpringProjectDemo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import SpringProjectDemo.Model.Project;


@Repository
public interface ProjectRepository extends CrudRepository<Project,String>{
	
}