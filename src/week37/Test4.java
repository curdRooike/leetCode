package week37;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2475. 数组中不等三元组的数目
 * @date 2023/6/13 12:11:17
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Test4().unequalTriplets(new int[]{4, 4, 2, 4, 3}));
    }
    public int unequalTriplets(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int x : nums) {
            count.merge(x, 1, Integer::sum);
        }
        System.out.println(count);
        int res = 0, n = nums.length, t = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            res += t * entry.getValue() * (n - t - entry.getValue());
            t += entry.getValue();
            System.out.println(t);
        }
        return res;
    }
}
