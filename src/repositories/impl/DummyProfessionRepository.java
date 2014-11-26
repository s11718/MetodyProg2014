package repositories.impl;

import java.util.List;

import domain.Profession;
import repositories.IRepository;


public class DummyProfessionRepository implements IRepository<Profession>{

	private DummyDB db;
	
	@Override
	public void save(Profession entity) {
		db.professions.add(entity);
		
	}
	
	public DummyProfessionRepository(DummyDB db) {
		this.db = db;
	}

	@Override
	public void update(Profession entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Profession entity) {
		// TODO Auto-generated method stub
		db.professions.remove(entity);
	}

	@Override
	public Profession get(int id) {
		for(Profession p: db.professions)
			if(p.getId()==id)
				return p;
		return null;
	}

	@Override
	public List<Profession> getAll() {
		return db.professions;
	}

}
