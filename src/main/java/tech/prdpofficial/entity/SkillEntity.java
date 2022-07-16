package tech.prdpofficial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Skill")
public class SkillEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name = "skill_image_name")
	private String skillImageName;
	
	@Column(name = "skill_name")
	private String skillName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkillImageName() {
		return skillImageName;
	}

	public void setSkillImageName(String skillImageName) {
		this.skillImageName = skillImageName;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	@Override
	public String toString() {
		return "SkillEntity [id=" + id + ", skillImageName=" + skillImageName + ", skillName=" + skillName + "]";
	}
	
	

}
