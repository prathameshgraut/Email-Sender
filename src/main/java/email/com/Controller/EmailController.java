package email.com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	
	@Autowired
	JavaMailSender javaMailSender;
	
	@GetMapping("/send")
	public String sendMail() {
		SimpleMailMessage sm = new SimpleMailMessage();
		sm.setTo("pawarbhavesh16@gmail.com");
		sm.setFrom("pgraut712@gmail.com");
		sm.setSubject("pg Spring Boot");
		sm.setText("Hi bhavesh  mc im Spring Boot Here To Send Mail");
		
		
		javaMailSender.send(sm);
		return "send mail";
	}
	
	
}
