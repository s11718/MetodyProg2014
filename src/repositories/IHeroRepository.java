package repositories;

import java.util.List;


public interface IHeroRepository extends IRepository<Hero>{

	public List<Hero> withProfession(Profession profession);
	public List<Hero> withRole(String roleName);
	public List<Hero> withRole(int roleId);
}
