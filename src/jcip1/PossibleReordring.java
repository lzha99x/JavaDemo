package jcip1;
/**
 * 如果在程序中没有包含足够的同步，那么可能产生奇怪的结果（不要这么做）。
 * 可能输出（1，0）或（0，1）
 * */
public class PossibleReordring {
	static int x = 0, y = 0;
	static int a = 0, b = 0;
	
	public static void main(String[] args)
			throws InterruptedException {
		Thread one = new Thread(() -> {
			a = 1;
			x = b;
		});
		
		Thread two = new Thread(() -> {
			b = 1;
			y = a;
		});
		
		one.start(); two.start();
		one.join(); two.join();
		System.out.println("("+ x + "," + y + ")");
	}

}
