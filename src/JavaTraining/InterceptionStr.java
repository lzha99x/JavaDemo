package JavaTraining;

import java.util.Scanner;

import org.omg.PortableServer.ServantRetentionPolicyValue;

public class InterceptionStr {
	static String ss;
	static int n;
	
	public static void main(String[] args) {
		System.out.println("�������ַ���");
		Scanner scannerStr = new Scanner(System.in);
		ss = scannerStr.next();
		scannerStr.close();
		
		System.out.println("�������ֽ���");
		Scanner scByte = new Scanner(System.in);
		n = scByte.nextInt();
		scByte.close();
		
		interception(setValue());
	}

	private static void interception(String[] strings) {
		int count = 0;
		// ���ֵ�������ʽ
		String m = "[\u4e00-\u9fa5]"; 
		System.out.println("��ÿ" + n +"�ֽڻ��ֵ��ַ�������:");
		
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].matches(m)) {
				count += 2;
			} else {
				count += 1;
			}
			
			if (count < n) {
				System.out.print(strings[i]);
			}
		}
	}

	private static Object setValue() {
		String[] string = new String[ss.length()];
		
		for (int i = 0; i < string.length; i++) {
			string[i] = ss.substring(i, i);
		}
		
		return string;
	}

}
