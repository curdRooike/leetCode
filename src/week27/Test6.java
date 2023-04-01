package week27;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1637. 两点之间不包含任何点的最宽垂直区域
 * @date 2023/3/30 11:26:01
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(new Test6().maxWidthOfVerticalArea(
                new int[][]{{8, 7}, {9, 9}, {7, 4}, {9, 7}}));
    }
    public int maxWidthOfVerticalArea(int[][] points) {
        int max = 0;
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < points.length - 1 ; i++) {
            max = Math.max(points[i + 1][0]-points[i][0],max);
        }
        return max;
    }
}
