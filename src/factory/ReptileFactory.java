package factory;

import factory.classes.Animal;
import factory.classes.Snake;
import factory.classes.Tyrannosaurus;

public class ReptileFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if ("snake".equals(type)) {
			return new Snake();
		} else {
			return new Tyrannosaurus();
		}
	}
}
