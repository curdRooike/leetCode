package week4;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 217. 存在重复元素
 * @date 2022/9/30 08:20:18
 */
public class Test6 {
    public static void main(String[] args) {
        int []a = {1,2,3,1};
        System.out.println(new Test6().containsDuplicate(a));
    }
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }
        List<Integer> list = hashMap.values().stream().filter(item -> (item > 1)).collect(Collectors.toList());
        return list.size() != 0;
    }
}
