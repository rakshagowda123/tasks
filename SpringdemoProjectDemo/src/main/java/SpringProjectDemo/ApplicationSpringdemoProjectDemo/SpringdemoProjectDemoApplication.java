package SpringProjectDemo.ApplicationSpringdemoProjectDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import SpringProjectDemo.Service.EmployeeService;

@SpringBootApplication 
@ComponentScan(basePackages = {"SpringProjectDemo.Controller","SpringProjectDemo.Service","SpringProjectDemo.Repository","SpringProjectDemo.Model"})
@EnableJpaRepositories(basePackages= {"SpringProjectDemo.Repository"})
@EntityScan(basePackages= {"SpringProjectDemo.Model"})
public class SpringdemoProjectDemoApplication   {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringdemoProjectDemoApplication.class, args);
//		EmployeeService service = context.getBean(EmployeeService.class);
		
	}
	private final String url = "jdbc:postgresql://localhost/mydb";
    private final String user = "postgres";
    private final String password = "hello";
public Connection connect()
{
    Connection conn = null;
    try {
        conn = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to the PostgreSQL server successfully.");
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }

    return conn;
}
    
	
}
