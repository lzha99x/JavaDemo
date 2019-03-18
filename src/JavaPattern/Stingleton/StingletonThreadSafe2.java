package JavaPattern.Stingleton;
/**
 * ������JVM�������ʱ�����ϴ�����instance.
 * */
public class StingletonThreadSafe2 {
	private static StingletonThreadSafe2 uniqueInstance = new StingletonThreadSafe2();
	
	private StingletonThreadSafe2() {}
	
	public static synchronized StingletonThreadSafe2 getInstance() {
		return uniqueInstance;
	}
}
