package jcip;
/**
 * ����ڳ�����û�а����㹻��ͬ������ô���ܲ�����ֵĽ������Ҫ��ô������
 * ���������1��0����0��1��
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
