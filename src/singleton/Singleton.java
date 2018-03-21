package singleton;

public class Singleton {

	private static Singleton singleton;

	private Singleton() {

	}

	public static Singleton getSingletonInstance() {
		if (singleton == null) {
			singleton = new Singleton();
			System.out.println("New instance created");
		}
		return singleton;
	}

}
