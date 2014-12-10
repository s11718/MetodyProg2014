package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Items;
import repositories.IRepository;

public class ItemsRepository extends Repository<Items>{

	protected ItemsRepository(Connection connection,
			IEntityBuilder<Items> builder) {
		super(connection, builder);
	}

	@Override
	protected void setUpUpdateQuery(Items entity) throws SQLException {
		update.setString(1, entity.getName());
		update.setString(2, entity.getType());
		update.setString(3, entity.getEffect());
		update.setInt(4, entity.getAmount());
		update.setInt(5, entity.getDurability());
		update.setFloat(6, entity.getValue());
		update.setInt(7, entity.getId());
	}

	@Override
	protected void setUpInsertQuery(Items entity) throws SQLException {
		insert.setString(1, entity.getName());
		insert.setString(2, entity.getType());
		insert.setString(2, entity.getEffect());
		insert.setInt(3, entity.getAmount());
		insert.setInt(4, entity.getDurability());
		insert.setFloat(5, entity.getValue());
	}

	@Override
	protected String getTableName() {
		return "items";
	}

	@Override
	protected String getUpdateQuery() {
		return "update items set (name,value,amount,type,durability,effect)=(?,?,?,?,?,?)"
				+ "where id=?";
	}

	@Override
	protected String getInsertQuery() {
		return "insert into items(name,value,amount,type,durability,effect) values(?,?,?,?,?,?)";
	}
	
	
}
