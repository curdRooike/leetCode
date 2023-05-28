package week36;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1439. 有序矩阵中的第 k 个最小数组和
 * @date 2023/5/28 11:32:56
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().
                kthSmallest(new int[][]{{1, 3, 11}, {2, 4, 5}}, 5));
    }
    public int kthSmallest(int[][] mat, int k) {
        var a = new int[]{0};
        for (int[] row : mat) {
            int i = 0;
            var b = new int[a.length * row.length];
            for (int x : a) {
                for (int y : row) {
                    b[i++] = x + y;
                }
            }
            Arrays.sort(b);
            if (b.length > k) {
                b = Arrays.copyOfRange(b, 0, k);
            }
            a = b;
        }
        return a[k - 1];
    }
}
