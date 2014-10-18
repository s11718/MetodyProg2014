package domain;

import java.util.ArrayList;
import java.util.List;

public class Profession extends Entity {

	public Profession (){
		this.skill=new ArrayList<Skill>();
	}
	
	private String name;
	private int minLvl;

	private List<Skill> skill;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinLvl() {
		return minLvl;
	}

	public void setMinLvl(int minLvl) {
		this.minLvl = minLvl;
	}

	public List<Skill> getSkill() {
		return skill;
	}

	public void setSkill(List<Skill> skill) {
		this.skill = skill;
	}
	
	
}
