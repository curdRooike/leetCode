package week25;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 面试题 17.05. 字母与数字
 * @date 2023/3/11 00:14:20
 */
public class Test2 {
    public static void main(String[] args) {
        String []s = {"A","1","B","C","D","2","3","4","E","5","F","G","6","7","H","I","J","K","L","M"};
        System.out.println(Arrays.toString(new Test2().findLongestSubarray(s)));
    }
    public String[] findLongestSubarray(String[] array) {
        Map<Integer, Integer> indices = new HashMap<Integer, Integer>();
        indices.put(0, -1);
        int sum = 0;
        int maxLength = 0;
        int startIndex = -1;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (Character.isLetter(array[i].charAt(0))) {
                sum++;
            } else {
                sum--;
            }
            if (indices.containsKey(sum)) {
                int firstIndex = indices.get(sum);
                if (i - firstIndex > maxLength) {
                    maxLength = i - firstIndex;
                    startIndex = firstIndex + 1;
                }
            } else {
                indices.put(sum, i);
            }
        }
        if (maxLength == 0) {
            return new String[0];
        }
        String[] ans = new String[maxLength];
        System.arraycopy(array, startIndex, ans, 0, maxLength);
        return ans;
    }
}
