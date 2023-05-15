package week34;

import util.SoutUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2441. 与对应负数同时存在的最大正整数
 * @date 2023/5/13 00:18:58
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(new Test5().findMaxK(new int[]{-1, 10, 6, 7, -7, 1}));
    }
    public int findMaxK(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (Integer num : set) {
            if (num > 0) break;
            if (set.contains(num *= -1))
                return num;
        }
        return -1;
    }
}
