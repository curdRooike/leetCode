package week17;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1814. 统计一个数组中好对子的数目
 * @date 2023/1/17 08:24:16
 */
public class Test5 {
    public static void main(String[] args) {
        int []a ={42,11,1,97};
        System.out.println(new Test5().countNicePairs(a));
    }
    public int countNicePairs(int[] nums) {
        final int MOD = 1000000007;
        int res = 0;
        Map<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int i : nums) {
            int temp = i,j = 0;
            while (temp > 0) {
                j = j * 10 + temp % 10;
                temp /= 10;
            }
            System.out.println(h.getOrDefault(i - j, 0));
            res = (res + h.getOrDefault(i - j,0)) % MOD;
            h.put(i - j,h.getOrDefault(i - j,0) + 1);
        }

        return res;
    }
}
