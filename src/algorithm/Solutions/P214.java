package Solutions;
/////////////////////////////////////////////////
// ADD-BINARY(A, B):
//   C = new integer[A.length + 1]

//   carry = 0
//   for i = 1 to A.length
//       C[i] = (A[i] + B[i] + carry) % 2  // remainder
//       carry = (A[i] + B[i] + carry) / 2 // quotient
//   C[i] = carry

//   return C
/////////////////////////////////////////////////
public class P214 {
    public int[] addBinary(int a[], int b[]) {
        int end = a.length;
        int sum[] = new int[end + 1];
        int carry = 0;

        for (int i = 0; i < end; i++) {
            sum[i] = (a[i] + b[i] + carry) % 2;
            carry = (a[i] + b[i] + carry) / 2;
        }
        sum[sum.length - 1] = carry;
        return sum;
    }
    public static void main(String[] args) {
        int a[] = {0,1,1,0};
        int b[] = {1,1,1,1};
        int c[] = {0};

        c = new P214().addBinary(a, b);
        for (int e: c)
            System.out.print(e + " ");
       
    }
}