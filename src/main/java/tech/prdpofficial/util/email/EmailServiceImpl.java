package tech.prdpofficial.util.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import tech.prdpofficial.entity.EnquiryEntity;

@Component
public class EmailServiceImpl implements EmailService {
	
	@Value("${spring.mail.username}")
	private String emailsender;
	
	@Autowired
    private JavaMailSender emailSender;

	@Override
	public void SendEmail(EnquiryEntity enquiryEntity) {

		System.out.println(emailsender);
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom("info@prdpofficial.tech");
		mailMessage.setTo(enquiryEntity.getEmail());
		mailMessage.setText(String.format("Hello, %s Thankyou for contacting us , Message : %s",enquiryEntity.getFullName(), enquiryEntity.getMessage()) );
		
		
		mailMessage.setSubject(String.format("Welcome %s" , enquiryEntity.getFullName()));
		emailSender.send(mailMessage);
		
	}
	
	
	
}
