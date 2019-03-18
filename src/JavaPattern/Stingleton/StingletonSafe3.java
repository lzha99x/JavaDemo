package JavaPattern.Stingleton;
/**
 * 双重检查锁的实现
 * */
public class StingletonSafe3 {
	private volatile static  StingletonSafe3 uniqueInstance;
	
	private StingletonSafe3() {}
	
	public static  StingletonSafe3 getInstance() {
		if (uniqueInstance == null) {
			synchronized (StingletonSafe3.class) {
				if (uniqueInstance == null) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					uniqueInstance = new StingletonSafe3();
				}
			}
		}
		return uniqueInstance;
	}
}
