package week25;

import util.SoutUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1590. 使数组和能被 P 整除
 * @date 2023/3/10 03:23:52
 */
public class Test1 {
    public static void main(String[] args) {
        int []a = {1000000000,1000000000,1000000000};
        System.out.println(new Test1().minSubarray(a, 3));
    }
   /* public int minSubarray(int[] nums, int p) {
        int count = 0, s = 0;
        long sum = 0;
        HashSet<Integer> hash = new HashSet<>();
        for (int num : nums) {
           s = (s + num) % p;
            hash.add(num);
            sum += num;
        }
        if (sum < p || !hash.contains(s))
            return -1;
        if (s == 0) {
            return 0;
        }
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; --i) {
            if (hash.contains(s - nums[i]) || s - nums[i] == 0){
                count++;
                s -= nums[i];
                if (s - nums[i] == 0)
                    return count;
            }
        }
        return count;
    }*/
   public int minSubarray(int[] nums, int p) {
       int x = 0;
       for (int num : nums) {
           x = (x + num) % p;
       }
       if (x == 0) {
           return 0;
       }
       Map<Integer, Integer> index = new HashMap<Integer, Integer>();
       int y = 0, res = nums.length;
       for (int i = 0; i < nums.length; i++) {
           index.put(y, i); // f[i] mod p = y，因此哈希表记录 y 对应的下标为 i
           y = (y + nums[i]) % p;
           if (index.containsKey((y - x + p) % p)) {
               res = Math.min(res, i - index.get((y - x + p) % p) + 1);
           }
       }
       return res == nums.length ? -1 : res;
   }

}
