package week18;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1828. 统计一个圆中点的数目
 * @date 2023/1/24 01:19:54
 */
public class Test5 {
    public static void main(String[] args) {
        int [][]a = {{1,3},{3,3},{5,3},{2,2}};
        int [][]a1 = {{2,3,1},{4,3,1},{1,1,2}};
        System.out.println(Arrays.toString(new Test5().countPoints(a, a1)));
    }
    public int[] countPoints(int[][] points, int[][] queries) {
        int m = points.length, n = queries.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; ++i) {
            int cx = queries[i][0], cy = queries[i][1], cr = queries[i][2];
            for (int j = 0; j < m; j++) {
                int px = points[j][0], py = points[j][1];
                if ((cx - px) * (cx - px) + (cy - py) * (cy - py) <= cr * cr) {
                    ++ans[i];
                }
            }
        }
        return ans;
    }
}
