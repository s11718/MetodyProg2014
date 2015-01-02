package repositories.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import repositories.IHeroRepository;
import unitofwork.IUnitOfWork;
import domain.Hero;
import domain.Profession;

public class HeroRepository 
	extends Repository<Hero> implements IHeroRepository{

	public HeroRepository(Connection connection,
			IEntityBuilder<Hero> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
	}

	@Override
	protected void setUpUpdateQuery(Hero entity) throws SQLException {
		update.setString(1, entity.getName());
		update.setString(2, entity.getProfession());
		update.setInt(3, entity.getMP());
		update.setInt(4, entity.getMP());
		update.setInt(5, entity.getEXP());
		update.setInt(6, entity.getId());
	}

	@Override
	protected void setUpInsertQuery(Hero entity) throws SQLException {
		insert.setString(1, entity.getName());
		insert.setString(2, entity.getProfession());
		insert.setInt(3, entity.getHP());
		insert.setInt(4, entity.getMP());
		insert.setInt(5, entity.getEXP());
	}

	@Override
	protected String getTableName() {
		return "heroes";
	}

	@Override
	protected String getUpdateQuery() {
		return "update heroes set (name, profession,hp,mp,exp)=(?,?,?,?,?)"
				+ "where id=?";
	}

	@Override
	protected String getInsertQuery() {
		return "insert into heroes(name,profession,hp,mp,exp) values(?,?,?,?,?)";
	}

	@Override
	public List<Hero> withProfession(Profession profession) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hero> withProfession(String professionName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hero> withProfession(int professionId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
