package com.test.abst.factory;

import com.test.abst.factory.classes.Animal;

public abstract class SpeciesFactory {
	public abstract Animal getAnimal(String type);

}
