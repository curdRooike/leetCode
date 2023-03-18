package week25;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1605. 给定行和列的和求可行矩阵
 * @date 2023/3/14 06:58:45
 */
public class Test4 {
    public static void main(String[] args) {
        int []a = {5,7,10};
        int []b = {8,6,8};
        System.out.println(Arrays.deepToString(new Test4().restoreMatrix(a, b)));
    }
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length, n = colSum.length;
        int[][] res = new int[m][n];
        for (int i = 0, j = 0; i < m && j < n; ) {
            int rs = rowSum[i], cs = colSum[j];
            if ((rs < cs)) {
                colSum[j] -= rs;
                res[i++][j] = rs;
            }else {
                rowSum[i] -= cs;
                res[i][j++] = cs;
            }
        }
        return res;
    }
}
