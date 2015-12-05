package com.test.singleton.main;

import com.test.singleton.Singleton;

public class SingletonMain {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingletonInstance();
		Singleton anotherSingleton = Singleton.getSingletonInstance();
	}

}
