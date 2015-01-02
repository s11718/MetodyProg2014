package repositories;

import domain.*;

public interface IRepositoryServer {

	public IHeroRepository getHeroes();
	public IRepository<Items> getItems();
}
