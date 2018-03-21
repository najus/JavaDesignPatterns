package factory;

import factory.classes.Animal;

public abstract class SpeciesFactory {
	public abstract Animal getAnimal(String type);

}
