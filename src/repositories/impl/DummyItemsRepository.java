package repositories.impl;

import java.util.List;

import domain.Items;
import repositories.IRepository;

public class DummyItemsRepository implements IRepository<Items> {

	private DummyDB db;

	@Override
	public void save(Items entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Items entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Items entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Items get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Items> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
