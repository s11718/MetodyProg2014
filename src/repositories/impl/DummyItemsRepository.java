package repositories.impl;

import java.util.List;

import domain.Items;
import repositories.IRepository;

public class DummyItemsRepository implements IRepository<Items> {

	private DummyDB db;

	public DummyItemsRepository(DummyDB db) {
	
		this.db = db;
	}

	@Override
	public void save(Items entity) {
		db.items.add(entity);
	}

	@Override
	public void update(Items entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Items entity) {
		db.items.remove(entity);
	}

	@Override
	public Items get(int id) {
		for(Items p: db.items)
			if(p.getId()==id)
				return p;
		return null;
	}

	@Override
	public List<Items> getAll() {
		return db.items;
	}
	
	
}
