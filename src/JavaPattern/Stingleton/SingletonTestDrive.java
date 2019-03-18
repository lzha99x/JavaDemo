package JavaPattern.Stingleton;

public class SingletonTestDrive {

	public static void main(String[] args) {
		Stingleton S1 = Stingleton.getInstance();
		Stingleton S2 = Stingleton.getInstance();
		
		System.out.println(S1);
		System.out.println(S2);
		// 使用默认的equals，判断2个对象的内存地址.
		System.out.println(S1.equals(S2));

	}

}
