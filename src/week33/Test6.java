package week33;

import java.util.*;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 49. 字母异位词分组
 * @date 2023/5/8 10:03:20
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(new Test6().groupAnagrams(new String[]{"eat", "tea",
                "tan", "ate", "nat", "bat"}));
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] counts = new int[26];
            int length = str.length();
            for (int i = 0; i < length; i++) {
                counts[str.charAt(i) - 'a']++;
            }
            // 将每个出现次数大于 0 的字母和出现次数按顺序拼接成字符串，作为哈希表的键
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (counts[i] != 0) {
                    sb.append((char) ('a' + i));
                    sb.append(counts[i]);
                }
            }
            String key = sb.toString();
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }

}
