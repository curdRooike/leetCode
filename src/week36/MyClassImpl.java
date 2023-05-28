package week36;

import annotation.RunTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 438. 找到字符串中所有字母异位词
 * @date 2023/5/24 09:17:36
 */
public class MyClassImpl implements MyClass{

    @RunTime
    public List<Integer> findAnagrams(String s, String p) {
        byte[] bytes = new byte[1024 * 1024 * 5];
        int n = p.length();
        int m = s.length();
        int[] hash = new int[26];
        int[] hash1 = new int[26];
        List<Integer> res = new ArrayList<>();
        for (char c : p.toCharArray()) {
            hash[c - 'a']++;
        }
        for (int i = 0; i < m - n + 1; i++) {
            Arrays.fill(hash1,0);
            for (char c : s.substring(i, i + n).toCharArray()) {
                hash1[c - 'a']++;
            }
            if (Arrays.equals(hash,hash1)) {
                res.add(i);
            }
        }
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return res;
    }
}
