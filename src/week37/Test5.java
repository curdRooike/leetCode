package week37;

import java.util.HashMap;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 560. 和为 K 的子数组
 * @date 2023/6/21 22:17:14
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(new Test5().subarraySum(new int[]{1, 2, 3}, 3));
    }
    public int subarraySum(int[] nums, int k) {
        int count = 0, pre = 0;
        HashMap< Integer, Integer > mp = new HashMap < > ();
        mp.put(0, 1);
        for (int num : nums) {
            pre += num;
            if (mp.containsKey(pre - k)) {
                count += mp.get(pre - k);
            }
            mp.put(pre, mp.getOrDefault(pre, 0) + 1);
        }
        System.out.println(mp);
        return count;
    }

}
