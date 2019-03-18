package JavaPattern.Stingleton;

public class Stingleton {
	public static Stingleton uniqueInstance;
	
	private Stingleton() {}
	
	public static Stingleton getInstance() {
		if ( uniqueInstance == null) {
			uniqueInstance = new Stingleton();
		}
		return uniqueInstance;
	}
}
