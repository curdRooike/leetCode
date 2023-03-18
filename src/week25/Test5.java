package week25;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1615. 最大网络秩
 * @date 2023/3/15 10:05:10
 */
public class Test5 {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[][] flag = new int[n][n];
        int [] count = new int[n];
        int max = 0;
        for (int[] road : roads) {
            flag[road[1]][road[0]] = 1;
            flag[road[0]][road[1]] = 1;
            ++count[road[0]];
            ++count[road[1]];
        }
        /*System.out.println(Arrays.deepToString(flag));
        System.out.println(Arrays.toString(count));*/
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++){
                int num = count[i] + count[j] - flag[i][j];
                max = Math.max(num,max);
            }
        }
        return max;
    }
}
