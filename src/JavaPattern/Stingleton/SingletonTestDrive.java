package JavaPattern.Stingleton;

public class SingletonTestDrive {

	public static void main(String[] args) {
		Stingleton S1 = Stingleton.getInstance();
		Stingleton S2 = Stingleton.getInstance();
		
		System.out.println(S1);
		System.out.println(S2);
		// ʹ��Ĭ�ϵ�equals���ж�2��������ڴ��ַ.
		System.out.println(S1.equals(S2));

	}

}
