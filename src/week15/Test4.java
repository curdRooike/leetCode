package week15;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 3. 无重复字符的最长子串
 * @date 2023/1/2 14:48:08
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Test4().lengthOfLongestSubstring("pwwkew"));
    }

    /**
     * 最长子串长度
     *
     * @param s 年代
     * @return int
     */
    /*public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;
        for(;right<s.length();right++) {
            char ch = s.charAt(right);
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);

            max = Math.max(max, right-left+1);
        }
        return max;
    }*/
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                start = Math.max(map.get(ch)+1,start);
            }
            max = Math.max(max,i - start + 1);
            map.put(ch,i);
        }
        System.out.println(map);
        return max;
    }
}
