package domain;

import java.util.ArrayList;
import java.util.List;

public class Items extends Entity {

	private float value;
	private int amount;
	private String type;
	private int durability;
	private String effect;
	
	public Items(){
		items=new ArrayList<Items>();
	}
	
	private List<Items> items;
	
	
	
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDurability() {
		return durability;
	}
	public void setDurability(int durability) {
		this.durability = durability;
	}
	
	
}
