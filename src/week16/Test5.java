package week16;

import util.SoutUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 169. 多数元素
 * @date 2023/1/10 08:40:44
 */
public class Test5 {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,1};
        System.out.println(new Test5().majorityElement(nums));
    }
    private Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num) + 1);
            }
        }
        return counts;
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);

        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
    }

}
