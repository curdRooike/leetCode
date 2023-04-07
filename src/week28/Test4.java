package week28;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1000. 合并石头的最低成本
 * @date 2023/4/4 00:23:32
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Test4()
                .mergeStones(new int[]{3, 2, 4, 1}, 2));
    }
    public int mergeStones(int[] stones, int k) {
            int n = stones.length;
            if ((n - 1) % (k - 1) > 0) // 无法合并成一堆
                return -1;

           int [] s = new int[n + 1];
            for (int i = 0; i < n; i++)
                s[i + 1] = s[i] + stones[i]; // 前缀和

            int [][] f = new int[n][n];
            for (int i = n - 1; i >= 0; --i)
                for (int j = i + 1; j < n; ++j) {
                    f[i][j] = Integer.MAX_VALUE;
                    for (int m = i; m < j; m += k - 1)
                        f[i][j] = Math.min(f[i][j], f[i][m] + f[m + 1][j]);
                    if ((j - i) % (k - 1) == 0) // 可以合并成一堆
                        f[i][j] += s[j + 1] - s[i];
                }
            return f[0][n - 1];
        }


}
