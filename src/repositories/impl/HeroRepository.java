package repositories.impl;

import java.sql.Connection;
import java.sql.SQLException;
import domain.Hero;

public class HeroRepository 
	extends Repository<Hero>{

	public HeroRepository(Connection connection,
			IEntityBuilder<Hero> builder) {
		super(connection, builder);
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
		return "hero";
	}

	@Override
	protected String getUpdateQuery() {
		return "update hero set (name, profession,hp,mp,exp)=(?,?,?,?,?)"
				+ "where id=?";
	}

	@Override
	protected String getInsertQuery() {
		return "insert into hero(name,profession,hp,mp,exp) values(?,?,?,?,?)";
	}
	
	
}
