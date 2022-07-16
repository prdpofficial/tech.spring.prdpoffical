package tech.prdpofficial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.prdpofficial.entity.EnquiryEntity;
import tech.prdpofficial.repository.EnquiryRepository;
import tech.prdpofficial.util.email.EmailService;

@Service
public class EnquiryServiceImpl implements EnquiryService {

	
	@Autowired
	private EnquiryRepository enquiryRepository;
	
	@Autowired
	private EmailService emailService;

	@Override
	public void saveEnquiry(EnquiryEntity enquiryEntity) {
		enquiryRepository.save(enquiryEntity);
		emailService.SendEmail(enquiryEntity);
		
	}

	
	
}
