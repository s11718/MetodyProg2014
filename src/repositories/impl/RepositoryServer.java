package repositories.impl;

import java.sql.Connection;

import domain.Items;
import repositories.IHeroRepository;
import repositories.IRepository;
import repositories.IRepositoryServer;
import unitofwork.IUnitOfWork;

public class RepositoryServer implements IRepositoryServer{

	private Connection connection;
	private IUnitOfWork uow;
	
	public RepositoryServer(Connection connection, IUnitOfWork uow) {
		super();
		this.connection = connection;
		this.uow = uow;
	}



	@Override
	public IHeroRepository getHeroes() {
		return new HeroRepository(connection, new HeroBuilder(), uow);
	}

	@Override
	public IRepository<Items> getItems() {
		return new ItemsRepository(connection, new ItemsBuilder(), uow);
	}

}
