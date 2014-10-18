package domain;

import java.util.ArrayList;
import java.util.List;

public class Skill extends Entity {

	public Skill (){
		this.profession=new ArrayList<Profession>();
	}
	
	private String name;
	private String type;
	private String effect;
	private int cost;
	private int cooldown;
	private int dmg;
	
	private List<Profession> profession;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCooldown() {
		return cooldown;
	}

	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	public List<Profession> getProfession() {
		return profession;
	}

	public void setProfession(List<Profession> profession) {
		this.profession = profession;
	}
	
	
	
	
}
