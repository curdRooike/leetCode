package week20;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1798. 你能构造出连续值的最大数目
 * @date 2023/2/4 12:09:21
 */
public class Test2 {
    public static void main(String[] args) {
        int []a = {1,1,1,4};
        System.out.println(new Test2().getMaximumConsecutive(a));
    }
    public int getMaximumConsecutive(int[] coins) {
        int res = 1;
        Arrays.sort(coins);
        for (int coin : coins) {
            if (coin > res)
                break;
            res += coin;
        }
        return res;
    }
}
