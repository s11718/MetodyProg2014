package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Hero;
import repositories.IRepository;

public class HeroRepository implements IRepository<Hero>{

	private Connection connection;
	
	private String insertSql=
			"INSERT INTO heroes(Name,Profession,HP,MP,EXP)"
			+ "VALUES(?,?,?,?,?)";
	
	private String selectByIDSql=
			"SELECT * FROM heroes WHERE id=?";
	private String updateSql=
		"UPDATE users SET (Name,Profession,HP,MP,EXP)=(?,?,?,?,?) WHERE id=?";
	private String deleteSql=
			"DELETE FROM users WHERE id=?";
	private String selectAllSql=
			"SELECT * FROM users";
	
	
	private PreparedStatement selectByID;
	private PreparedStatement insert;
	private PreparedStatement delete;
	private PreparedStatement update;
	private PreparedStatement selectAll;
	
public HeroRepository(Connection connection) {
		
		this.connection = connection;
		try {
			selectByID=connection.prepareStatement(selectByIDSql);
			insert = connection.prepareStatement(insertSql);
			delete = connection.prepareStatement(deleteSql);
			update = connection.prepareStatement(updateSql);
			selectAll = connection.prepareStatement(selectAllSql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void save(Hero entity) {
		try {
			insert.setString(1, entity.getName());
			insert.setString(2, entity.getProfession());
			insert.setInt(3, entity.getHP());
			insert.setInt(4, entity.getMP());
			insert.setInt(5, entity.getEXP());
			insert.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void update(Hero entity) {
		try {
			insert.setString(1, entity.getName());
			insert.setString(2, entity.getProfession());
			insert.setInt(3, entity.getHP());
			insert.setInt(4, entity.getMP());
			insert.setInt(5, entity.getEXP());
			update.setInt(6, entity.getId());
			insert.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void delete(Hero entity) {
		try {
			delete.setInt(1, entity.getId());
			delete.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public Hero get(int id) {
		try {
			selectByID.setInt(1, id);
			ResultSet rs = selectByID.executeQuery();
			while(rs.next())
			{
				Hero result = new Hero();
				result.setId(rs.getInt("id"));
				result.setName(rs.getString("name"));
				result.setProfession(rs.getString("profession"));
				result.setHP(rs.getInt("hp"));
				result.setMP(rs.getInt("mp"));
				result.setEXP(rs.getInt("exp"));
				return result;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	@Override
	public List<Hero> getAll() {
List<Hero> result = new ArrayList<Hero>();
		
		try {
			ResultSet rs= selectAll.executeQuery();
			while(rs.next())
			{
				Hero hero = new Hero();
				hero.setId(rs.getInt("id"));
				hero.setName(rs.getString("name"));
				hero.setProfession(rs.getString("profession"));
				hero.setHP(rs.getInt("hp"));
				hero.setMP(rs.getInt("mp"));
				hero.setEXP(rs.getInt("exp"));
				result.add(hero);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	

}
