package Solutions;

public class Insertion_sort {

    public void isSort(int arr[]) {
        int j =0, i = 0, key;

        for (j = 1; j < arr.length; j++) {
            key = arr[j];
            i = j -1;
            while (i >= 0 && arr[i] > key) {
                arr[i+1] = arr[i];
                i = i - 1;
            }
            arr[++i] = key;
        }
    }
    public static void main(String[] args) {
        int X[] = {10,3,5,4,7,6,9,8};
        new Insertion_sort().isSort(X);

        for (int i: X)
        System.out.print(i + " ");
    }
}