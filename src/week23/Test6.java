package week23;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2373. 矩阵中的局部最大值
 * @date 2023/3/1 10:39:32
 */
public class Test6 {
    public static void main(String[] args) {
        int [][] a = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        System.out.println(Arrays.deepToString(new Test6().largestLocal(a)));
    }
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n - 2][n - 2];
        int x = 0,y;
        for (int i = 1; i < n - 1; i++) {
            y = 0;
            for (int j = 1; j < n - 1; j++) {
                ans[x][y++] = getMax(i,j,grid);
            }
            x++;
        }
        return ans;
    }
    public int getMax(int i,int j,int[][] grid){
        int max = 0;
        for (int i1 = i - 1; i1 <= i+1; i1++) {
            for (int i2 = j - 1; i2 <= j + 1; i2++) {
                max = Math.max(max,grid[i1][i2]);
            }
        }
        return max;
    }
}
