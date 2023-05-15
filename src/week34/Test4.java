package week34;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 128. 最长连续序列
 * @date 2023/5/12 01:12:42
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Test4().longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        int res = 0;
        for (Integer num : hashSet) {
            if (!hashSet.contains(num - 1)) {
                int cNum = num;
                int count = 1;
                while (hashSet.contains(cNum + 1)) {
                    cNum++;
                    count++;
                }
                res = Math.max(res,count);
            }
        }
        return res;
    }
}
