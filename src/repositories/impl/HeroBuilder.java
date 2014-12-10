package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Hero;

public class HeroBuilder implements IEntityBuilder<Hero>{

	@Override
	public Hero build(ResultSet rs) throws SQLException {
		Hero result = new Hero();
		result.setName(rs.getString("name"));
		result.setProfession(rs.getString("profession"));
		result.setHP(rs.getInt("hp"));
		result.setMP(rs.getInt("mp"));
		result.setEXP(rs.getInt("exp"));
		result.setId(rs.getInt("id"));
		return result;
	}

}
