import jdk.jfr.Unsigned;

public class InplaceSwap {
    
    private void inplace_swap(int a[], int i, int j) {
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];
    }

    private void reverse_array(int a[]) {
        for (int first = 0, last = a.length - 1; first < last; first++, last--) {
            inplace_swap(a, first, last);
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int number = 0x87654321;
        new InplaceSwap().reverse_array(a);

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        // System.out.println(Integer.toHexString(number ^ ~0xff));
        // System.out.println(Integer.toHexString(number | 0xff));
        System.out.println(Integer.toHexString(0xFEDCBA98 >> 36));
    }
}
