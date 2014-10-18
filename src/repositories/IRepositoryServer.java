package repositories;

public interface IRepositoryServer<Items> {

	public IHeroRepository getHero();
	public IRepository<Items> getItems();
}
