package tech.prdpofficial.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.prdpofficial.entity.SkillEntity;
import tech.prdpofficial.repository.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService {

	@Autowired
	private SkillRepository skillRepository;

	@Override
	public void saveSkill(SkillEntity skillEntity) {
		skillRepository.save(skillEntity);
		
	}
	

	List<SkillEntity> listOfAllSkills = new ArrayList<SkillEntity>();
	
	
	@Override
	public List<SkillEntity> getAllSkills() {
		if(listOfAllSkills.isEmpty()) {
			listOfAllSkills = skillRepository.findAll();
		}
		
		return listOfAllSkills;
	}

	@Override
	public void deleteSkillById(int id) {
		skillRepository.deleteById(id);
		
	}
	
}
