package repositories.impl;


import java.util.ArrayList;
import java.util.List;

import domain.Hero;
import domain.Profession;
import repositories.IHeroRepository;


public class DummyHeroRepository implements IHeroRepository{

	private DummyDB db;
	
	public DummyHeroRepository(DummyDB db) {
		super();
		this.db = db;
	}

	@Override
	public void save(Hero entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Hero entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Hero entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Hero get(int id) {
		for(Hero u:db.heroes)
			if(u.getId()==id)
				return u;
		return null;
	}

	@Override
	public List<Hero> getAll() {
		return db.heroes;
	}

	@Override
	public List<Hero> withProfession(Profession profession) {
		return withProfession(profession.getId());
	}

	@Override
	public List<Hero> withProfession(String professionName) {
		for(Profession r:db.professions)
			if(r.getName().equals(professionName))
				return r.getHeroes();
		return new ArrayList<Hero>();
	}

	@Override
	public List<Hero> withProfession(int professionId) {
		for(Profession r:db.professions)
			if(r.getId()==professionId)
				return r.getHeroes();
		return new ArrayList<Hero>();
	}


	
	}
	
