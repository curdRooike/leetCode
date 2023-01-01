package week15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2032. 至少在两个数组中出现的值
 * @date 2022/12/29 15:00:35
 */
public class Test1 {
    public static void main(String[] args) {
        int []a = {1,1,3,2};
        int []a1 = {2,3};
        int []a2 = {3};
        System.out.println(new Test1().twoOutOfThree(a, a1, a2));
    }
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i, 1);
        }
        for (int i : nums2) {
            map.put(i, map.getOrDefault(i, 0) | 2);
        }
        for (int i : nums3) {
            map.put(i, map.getOrDefault(i, 0) | 4);
        }
      return map.keySet().stream().filter(item -> (map.get(item) &
               (map.get(item)-1)) != 0)
               .collect(Collectors.toList());
    }
}
