package JavaPattern.Stingleton;


class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 1; i++) {
			System.out.println(StingletonSafe3.getInstance());
		}
	}
	
}

class MyThread2 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 1; i++) {
			System.out.println(StingletonSafe3.getInstance());
		}
	}
	
}
public class SingletonTestDrive {
	


	public static void main(String[] args) throws InterruptedException {
//		Stingleton S1 = Stingleton.getInstance();
//		Stingleton S2 = Stingleton.getInstance();
		MyThread thread1 = new MyThread();
		MyThread2 thread2 = new MyThread2();
		
//		System.out.println(S1);
//		System.out.println(S2);
		// 使用默认的equals，判断2个对象的内存地址.
//		System.out.println(S1.equals(S2));
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		
		
		

	}

}
