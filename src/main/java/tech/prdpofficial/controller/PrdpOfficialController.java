package tech.prdpofficial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import tech.prdpofficial.entity.EnquiryEntity;
import tech.prdpofficial.entity.SkillEntity;
import tech.prdpofficial.services.EnquiryService;
import tech.prdpofficial.services.SkillService;

@Controller
public class PrdpOfficialController {
	
	@Autowired
	private EnquiryService enquiryService;
	
	@Autowired
	private SkillService skillService;

	@RequestMapping("/")
	public String index(ModelMap map) {
		List<SkillEntity> listOfSkills = skillService.getAllSkills();
		System.out.println(listOfSkills.toString());
		map.addAttribute("skills", listOfSkills);
		return "index";
	}
	
	@RequestMapping("/enquiryForm")
	public String enquiryForm(@ModelAttribute EnquiryEntity enquiryEntity, ModelMap map) {
		List<SkillEntity> listOfSkills = skillService.getAllSkills();
		map.addAttribute("skills", listOfSkills);
		enquiryService.saveEnquiry(enquiryEntity);
		return "index";
	}
	
}
