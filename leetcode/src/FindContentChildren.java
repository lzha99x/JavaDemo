import java.util.Arrays;
/**
 * https://leetcode-cn.com/problems/assign-cookies/
 * 455
*/
public class FindContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        int numOfChildren = g.length, numOfCookies = s.length;
        
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = 0, j = 0; i < numOfChildren && j < numOfCookies; i++, j++) {
            while (j < numOfCookies && g[i] > s[j]) {
                j++;
            }
            if (j < numOfCookies) {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        int[] a = {2,2};
        int[] s = {1,2,3,4};
        int count = 0;

        count = new FindContentChildren().findContentChildren(a, s);
        System.out.println(count);
    }
}
