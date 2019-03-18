package JavaPattern.Stingleton;

public class StingletonThreadSafe {
	private static StingletonThreadSafe uniqueInstance;
	
	private StingletonThreadSafe() {}
	
	public static synchronized StingletonThreadSafe getInstance() {

		if ( uniqueInstance == null) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			uniqueInstance = new StingletonThreadSafe();
		}
		return uniqueInstance;
	}
}
