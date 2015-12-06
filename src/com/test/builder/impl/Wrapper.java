package com.test.builder.impl;

import com.test.builder.interfaces.Packing;

public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper";
	}

}
