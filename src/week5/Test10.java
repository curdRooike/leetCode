package week5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 290. 单词规律
 * @date 2022/10/9 09:38:38
 */
public class Test10 {
    public static void main(String[] args) {
        System.out.println(new Test10().wordPattern("abcdefghijklmnnmlkjihgfedcba", "aa bb cc dd ee ff gg hh ii jj kk ll mm nn nn mm ll kk jj ii hh gg ff ee dd cc bb aa"));
    }
    public boolean wordPattern(String pattern, String s) {
        String[] text = s.split(" ");
        if (pattern.length() != text.length)
            return false;
        int[] map = new int[128];
        int count = 1;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            //当前字母第一次出现,赋值
            if (map[c-'a'] == 0) {
                map[c-'a'] = count;
                count++;
            }
            sb.append(map[c-'a']);
        }
        count = 1;
        Arrays.fill(map,0);
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < text.length; i++) {
            String s1 = text[i];
            if (!hashMap.containsKey(s1)) {
                hashMap.put(s1,i);
                map[i] = count;
                count++;
            }else {
                map[i] = map[hashMap.get(s1)];
            }
            sb1.append(map[i]);
        }
       return sb.toString().equals(sb1.toString());
    }
}
