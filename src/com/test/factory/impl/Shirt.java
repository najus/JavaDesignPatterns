package com.test.factory.impl;

import com.test.factory.GarmentType;

public class Shirt implements GarmentType {

	@Override
	public String print() {
		return "shirt";
	}

}
