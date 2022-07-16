package tech.prdpofficial.services;

import java.util.List;

import tech.prdpofficial.entity.SkillEntity;

public interface SkillService {

	void saveSkill(SkillEntity skillEntity);

	List<SkillEntity> getAllSkills();

	void deleteSkillById(int id);

}
