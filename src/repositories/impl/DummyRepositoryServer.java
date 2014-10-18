package repositories.impl;

import domain.Items;
import repositories.IHeroRepository;
import repositories.IRepository;
import repositories.IRepositoryServer;

public class DummyRepositoryServer implements IRepositoryServer{

	private DummyDB db = new DummyDB();

	@Override
	public IHeroRepository getHero() {
		return new DummyHeroRepository(db);
	}

	@Override
	public IRepository<Items> getItems() {
		return new DummyItemsRepository(db);
	}
	
}
