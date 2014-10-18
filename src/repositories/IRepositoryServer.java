package repositories;

public interface IRepositoryServer {

	public IHeroRepository getHero();
	public IRepository<Items> getItems();
}
