// package greedy_algorithm;

// import java.util.Arrays;
// import java.util.Comparator;

// public class knapsack {
//     public static void main(String[] args) {
//         double M = 19;
//         Three[] arr = new Three[6];

//         arr[0] = new Three(3,4);
//         arr[1] = new Three(2,8);
//         arr[2] = new Three(6,1);
//         arr[3] = new Three(7,9);
//         arr[4] = new Three(4,3);
//         arr[5] = new Three(10,2);
//         // arr[6] = new three(5,5);
//         // arr[7] = new three(4,6);
//         // arr[8] = new three(5,7);
//         // arr[9] = new three(5,15);
//         // Arrays.sort(arr, new MyComparator());

//         // Arrays.sort(arr, (first, second) -> {
//         //     if (first.p > second.p) return -1;
//         //     else if (first.p < second.p) return 1;
//         //     else  return 0;
//         // });
//         Arrays.sort(arr, Comparator.comparing(Three::getP));
        
        
//         double sum = 0.0;
//         for (Three t: arr) {
//             System.out.println("arr = " + t.p + " ");
//             if ( M > t.w) {
//                 M -=t.w;
//                 sum += t.v;
//             } else {
//                 sum += M * t.p;
//                 break;
//             }
//         }
//         System.out.println();
//         System.out.println(sum);
//     }
// }

// class MyComparator implements Comparator<three> {
//     @Override
//     public int compare(three a, three b) {
//         int result = 0;

//         if (a.p > b.p)
//             result = -1;
//         else if (a.p < b.p)
//             result = 1;
//         else
//             result = 0;
//         return result;
//     }
// }

// class three {
//     double w; //重量
//     double v; //价值
//     double p; //性价比

//     public three(double w, double v) {
//         this.w = w;
//         this.v = v;
//         this.p = v/w;
//     }

//     /**
//      * @return the p
//      */
//     public double getP() {
//         return p;
//     }
// }

