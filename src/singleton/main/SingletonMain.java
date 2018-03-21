package singleton.main;

import singleton.Singleton;

public class SingletonMain {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingletonInstance();
		Singleton anotherSingleton = Singleton.getSingletonInstance();
	}

}
