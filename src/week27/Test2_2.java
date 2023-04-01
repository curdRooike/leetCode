package week27;

import week25.Test5;

import java.util.HashSet;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 575. 分糖果
 * @date 2023/3/26 01:51:04
 */
public class Test2_2 {
    public static void main(String[] args) {
        System.out.println(new Test2_2().distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));
    }
    public int distributeCandies(int[] candyType) {
        HashSet<Object> set = new HashSet<>();
        for (int i : candyType) {
            set.add(i);
        }
        return Math.min(set.size() , candyType.length / 2);
    }
}
