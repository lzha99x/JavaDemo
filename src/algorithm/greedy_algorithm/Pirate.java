package algorithm.greedy_algorithm;

import java.lang.annotation.Documented;
import java.util.Arrays;
import java.util.Scanner;

class Pirate {
    private static double[] weights = {2.0,3.0,1,56,4,7,9,5};
    private static double totalW = 30;
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // for (int i = 0; i < 10; i++){
        //     String ch = input.next();
        //     w[i] = Double.valueOf(ch.toString());
        // }
        Arrays.sort(weights);
        double tmpW = 0;
        int ans = 0;
        for (double weight : weights) {
            tmpW += weight;
            if (tmpW <= totalW){
                ans++;
                System.out.print(weight + " ");
            } else {
                break;
            }
        }
        System.out.println();
        System.out.println(ans);
        // input.close();
    }
}