package tech.prdpofficial.util.email;

import tech.prdpofficial.entity.EnquiryEntity;

public interface EmailService {
	
	 void SendEmail(EnquiryEntity enquiryEntity);

}
