package JavaPattern.Stingleton;

public class Stingleton {
	private static Stingleton uniqueInstance;
	
	private Stingleton() {}
	
	public static  Stingleton getInstance() {

		if ( uniqueInstance == null) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			uniqueInstance = new Stingleton();
		}
		return uniqueInstance;
	}
}
