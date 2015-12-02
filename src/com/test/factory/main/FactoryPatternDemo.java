package com.test.factory.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.test.factory.GarmentType;
import com.test.factory.impl.GarmentFactory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		System.out.println("Enter your selection:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String selection = null;
		try {
			selection = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		GarmentType objGarmentType = GarmentFactory.createGarments(selection);
		System.out.println(objGarmentType.print());
	}
}
