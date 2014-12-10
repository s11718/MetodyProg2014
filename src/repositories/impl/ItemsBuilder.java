package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Items;

public class ItemsBuilder implements IEntityBuilder<Items>{

	@Override
	public Items build(ResultSet rs) throws SQLException {
		Items result = new Items();
		result.setName(rs.getString("name"));
		result.setType(rs.getString("type"));
		result.setEffect(rs.getString("effect"));
		result.setAmount(rs.getInt("amount"));
		result.setDurability(rs.getInt("durability"));
		result.setValue(rs.getFloat("value"));
		result.setId(rs.getInt("id"));
		return result;
	}

}
