package Chapter3;

import java.util.Arrays;

public class BinarySearchTest {

    public   int binarySearch(int s[], int x, int low, int high) {
        if (low > high)
            return -1;

        int middle = (low + high) / 2;
        if (x == s[middle])
            return middle;
        else if (x < s[middle])
            return binarySearch(s, x, low, middle-1);
        else 
            return binarySearch(s, x, middle+1, high);
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,5,6,7,8,9};
        Arrays.sort(arr);
        for (int a: arr)
            System.out.print(a + " ");
        System.out.println();
        System.out.println(new BinarySearchTest().binarySearch(arr, 7, 0, arr.length));
    }
}