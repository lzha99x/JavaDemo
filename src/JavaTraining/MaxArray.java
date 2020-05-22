package JavaTraining;

public class MaxArray {
	public static int getMaxValue(int a[]){
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;	
	}
	
	private static void showValue(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
			if ( (i+1) % 5 == 0)
				System.out.println();
		}
	}

	private static void setValue(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100);
		}
	}
	
	public static void main(String[] args) {
		int array[] = new int[10];
		
		setValue(array);
		showValue(array);
		System.out.println("\n max = " + getMaxValue(array));
	}
}
