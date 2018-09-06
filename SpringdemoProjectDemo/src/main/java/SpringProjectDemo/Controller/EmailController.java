package SpringProjectDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import SpringProjectDemo.Service.EmailService;

@Controller
public class EmailController {

	@Autowired
	EmailService service;
	private JavaMailSender mailSender;
	
	@RequestMapping(value="/SendMail")
	public String sendMail() {
//	{	service.EmailServiceX();
		service.prepareAndSend("rgowda19961996@gmail.com","Project Changed");
		return "mailsent";
		
	}
	
}
