package domain;

import java.util.*;


public class Profession extends Entity {

	public Profession (){
		this.skill=new ArrayList<Skill>();
		this.heroes=new ArrayList<Hero>();
	
	}
	
	private String name;
	private int minLvl;

	private List<Hero> heroes;
	private List<Skill> skill;

	public String getName() {
		return name;
	}

	
	public List<Hero> getHeroes() {
		return heroes;
	}


	public void setHeroes(List<Hero> heroes) {
		this.heroes = heroes;
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
