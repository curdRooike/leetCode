package week31;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1105. 填充书架
 * @date 2023/4/27 10:57:58
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Test4().minHeightShelves(
                new int[][]{{1, 1}, {2,3},{2,3},{1,1},{1,1}}, 4));
    }
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int n = books.length;
        int[] dp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            dp[i + 1] = Integer.MAX_VALUE;
            int max = 0, left = shelfWidth;
            for (int j = i; j >= 0; j--) {
                left -= books[j][0];
                if (left < 0) break; // 空间不足，无法放书
                max = Math.max(max, books[j][1]);
                dp[i + 1] = Math.min(dp[i + 1],dp[j] + max);
            }
        }
        return dp[n];
    }
}
