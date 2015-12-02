package com.test.factory.impl;

import com.test.factory.GarmentType;

public class GarmentFactory {

	public static GarmentType createGarments(String garment) {

		if (garment.equalsIgnoreCase("trouser"))
			return new Trouser();
		if (garment.equalsIgnoreCase("shirt"))
			return new Shirt();
		throw new IllegalArgumentException("No proper selection. Select \"trouser\" or \"shirt\"");

	}

}
