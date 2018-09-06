package SpringProjectDemo.Service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private JavaMailSender mailSender;
//    @Autowired
//    public void EmailServiceX() {
//    	Properties props = new Properties();
//    	props.put("mail.smtp.host", "smtp.live.com");
//    	props.put("mail.smtp.socketFactory.port", "25");
//    	props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
//    	props.put("mail.smtp.auth", "true");
//    	props.put("mail.smtp.port", "25");
//    	props.put("mail.smtp.starttls.enable","true" );
//
//    	Session session = Session.getDefaultInstance(props,
//    		new javax.mail.Authenticator() {
//    			protected PasswordAuthentication getPasswordAuthentication() {
//    				return new PasswordAuthentication("rramegowda@teksystems.com","Speedy@2404");
//    			}
//    		});
//
//    	try {
//
//    		Message message = new MimeMessage(session);
//    		message.setFrom(new InternetAddress("from@no-spam.com"));
//    		message.setRecipients(Message.RecipientType.TO,
//    				InternetAddress.parse("abhishekshekhawat99@gmail.com"));
//    		message.setSubject("Testing Subject");
//    		message.setText("Dear Mail Crawler," +"\n\n No spam to my email, please!");    		
//    		Transport.send(message);
//
//    		System.out.println("Done");
//
//    	} catch (MessagingException e) {
//    		throw new RuntimeException(e);
//    	}
//
//    }
    @Autowired
    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;

    }
 
   // private String recipient ="rramegowda@teksystems.com";
    public void prepareAndSend(String recipient, String message) {
        
   	 MimeMessagePreparator messagePreparator = mimeMessage -> {
   	        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
   	        messageHelper.setFrom("rgowda19961996@gmail.com");
   	        messageHelper.setTo(recipient);
   	        messageHelper.setSubject("Project Changed");
   	        messageHelper.setText(message);
   	    };
   	    try {
   	        mailSender.send(messagePreparator);
   	    } catch (MailException e) {
   	        // runtime exception; compiler will not force you to handle it
   	    }
   	}
   }
 
