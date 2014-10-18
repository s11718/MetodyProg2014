package repositories;

import java.util.List;

import domain.Hero;
import domain.Profession;


public interface IHeroRepository extends IRepository<Hero>{

	public List<Hero> withProfession(Profession profession);
	public List<Hero> withProfession(String professionName);
	public List<Hero> withProfession(int professionId);
}
