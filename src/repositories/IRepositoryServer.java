package repositories;

import domain.Items;

public interface IRepositoryServer {

	public IHeroRepository getHero();
	public IRepository<Items> getItems();
}
