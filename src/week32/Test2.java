package week32;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1033. 移动石子直到连续
 * @date 2023/4/29 23:49:51
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(Arrays.
                toString(new Test2().numMovesStones(1, 5, 10)));
    }
    public int[] numMovesStones(int a, int b, int c) {
        int x = Math.min(Math.min(a, b), c);
        int z = Math.max(Math.max(a, b), c);
        int y = a + b + c - x - z;

        int[] res = new int[2];
        res[0] = 2;
        if (z - y == 1 && y - x == 1) {
            res[0] = 0;
        } else if (z - y <= 2 || y - x <= 2) {
            res[0] = 1;
        }
        res[1] = z - x - 2;
        return res;
    }
}
