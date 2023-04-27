package week31;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1048. 最长字符串链
 * @date 2023/4/27 10:26:39
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().longestStrChain(new String[]{
                "a", "b", "ba", "bca", "bda", "bdca"
        }));
    }
    public int longestStrChain(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        Map<String, Integer> hashMap = new HashMap<>();
        int res = 0;
        for (String word : words) {
            int item = 0;
            for (int i = 0; i < word.length(); i++) {
                String s = word.substring(0, i) + word.substring(i + 1);
                item = Math.max(item, hashMap.getOrDefault(s,0));
            }
            hashMap.put(word, item + 1);
            res = Math.max(res, item + 1);
        }
        return res;
    }
}
