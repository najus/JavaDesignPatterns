package com.test.abst.factory;

import com.test.abst.factory.classes.Animal;
import com.test.abst.factory.classes.Cat;
import com.test.abst.factory.classes.Dog;

public class MammalFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if ("dog".equals(type)) {
			return new Dog();
		} else {
			return new Cat();
		}
	}

}
