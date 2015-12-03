package com.test.abst.factory;

import com.test.abst.factory.classes.Animal;
import com.test.abst.factory.classes.Snake;
import com.test.abst.factory.classes.Tyrannosaurus;

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
