package week2;

import java.util.*;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 按照频率将数组升序排序
 * @date 2022/9/19 12:39:06
 */
public class Test7 {
    public static void main(String[] args) {
        int []a = {-1,1,-6,4,5,-6,1,4,1};
        new Test7().frequencySort(a);
    }
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : nums) {
            arrayList.add(num);
        }
        Collections.sort(arrayList,(a,b)->{
            int num1 = map.get(a),num2 = map.get(b);
            return num1 != num2 ? num1 - num2 : b - a;
        });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arrayList.get(i);
        }
        return nums;
    }
}
