/**
 * 时间复杂度 O(1): java中integer的大小是固定的，32位最多需要32次迭代。
 *  *所以处理时间也是固定的。
 *  *该算法需要的迭代次数更少.
 * 空间复杂度 O(1), 与输入无关，使用恒定大小空间。
*/

public class HanmingDistance {
    public int hanmingDistance(int x, int y) {
        int distance = 0;
        int xor = x ^ y;

        while ( xor != 0) {
            distance += 1;
            // 当我们在 number 和 number-1 上做 AND 位运算时，
            // 原数字 number 的最右边等于 1 的比特会被移除.
            xor = xor & (xor - 1);
        }
        return distance;
    }

    public static void main(String[] args) {
        int res = 0;

        res = new HanmingDistance().hanmingDistance(1, 4);
        System.out.println(res);
    }
}
