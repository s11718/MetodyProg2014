package domain;

import java.util.*;

public class Hero extends Entity {

	private String Name;
	private String Profession;

	private int HP;
	private int MP;
	private int EXP;
	
	private List<Items> items;
	private List<Skill> skills;
	
	public Hero(){
		super();
		items=new ArrayList<Items>();
		skills=new ArrayList<Skill>();
		
}	
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public int getMP() {
		return MP;
	}
	public void setMP(int mP) {
		MP = mP;
	}
	public int getEXP() {
		return EXP;
	}
	public void setEXP(int eXP) {
		EXP = eXP;
	}
	public String getProfession() {
		return Profession;
	}
	public void setProfession(String profession) {
		Profession = profession;
	}
	

	

}
