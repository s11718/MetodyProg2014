package domain;

import java.util.ArrayList;
import java.util.List;

public class Inventory extends Entity {

	public Inventory (){
		this.items=new ArrayList<Items>();
	}
	
	private int capacity;
	private String category;
	
	private List<Items> items;
	
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	
	
	
	
}
