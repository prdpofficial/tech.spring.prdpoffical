package tech.prdpofficial.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.prdpofficial.entity.SkillEntity;
import tech.prdpofficial.services.SkillService;

@RestController
public class PrdpOfficialRestContoller {

	@Autowired
	private SkillService skillService;
	
	@GetMapping("/skill/get")
	public List<SkillEntity> getAllSkills(){
		
		List<SkillEntity> listOfSkills = skillService.getAllSkills();
		return listOfSkills;
	}
	
	@PostMapping("/skill")
	public String addSkills(@RequestBody SkillEntity skillEntity) {
		skillService.saveSkill(skillEntity);
		
		return "Done";
	}
	
	@DeleteMapping("/skill/{id}")
	public String deleteSkillById(@PathVariable int id) {
		skillService.deleteSkillById(id);
		return "Done";
	}
}
