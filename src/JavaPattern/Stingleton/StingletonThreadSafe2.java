package JavaPattern.Stingleton;
/**
 * 依赖于JVM加载类的时候马上创建该instance.
 * */
public class StingletonThreadSafe2 {
	private static StingletonThreadSafe2 uniqueInstance = new StingletonThreadSafe2();
	
	private StingletonThreadSafe2() {}
	
	public static synchronized StingletonThreadSafe2 getInstance() {
		return uniqueInstance;
	}
}
