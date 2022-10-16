package week3;

import java.util.TreeSet;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 第三大的数
 * @date 2022/9/23 15:19:11
 */
public class Test4 {
    public static void main(String[] args) {
        int []a = {1,2147483647,-2147483648};
        System.out.println(new Test4().thirdMax(a));
    }
    public int thirdMax(int[] nums) {
        TreeSet<Integer> s = new TreeSet<>();
        for (int num : nums) {
            s.add(num);
            if (s.size() > 3) {
                s.remove(s.first());
            }
        }
        return s.size() == 3 ? s.first() : s.last();
    }
}
