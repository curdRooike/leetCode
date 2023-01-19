package week17;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1819. 序列中不同最大公约数的数目
 * @date 2023/1/14 17:56:19
 */
public class Test2 {
    public static void main(String[] args) {
        int []nums = {6,10,3};
        System.out.println(new Test2().countDifferentSubsequenceGCDs(nums));
    }
    public int countDifferentSubsequenceGCDs(int[] nums) {
        int ans = 0, mx = 0;
        for (int x : nums) mx = Math.max(mx, x);
        boolean[] has = new boolean[mx + 1];
        for (int x : nums) has[x] = true;
        for (int i = 1; i <= mx; i++) {
            int g = 0;
            for (int j = i; j <= mx && g != i; j += i){
                if (has[j]) // 如果 j 在 nums 中
                    g = gcd(g, j); // 更新最大公约数
            }
            if (g == i) ++ans;
        }
        return ans;
    }
    private int gcd(int a, int b) {
        while (a != 0) {
            int tmp = a;
            a = b % a;
            b = tmp;
        }
        return b;
    }
}
