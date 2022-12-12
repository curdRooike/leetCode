package week13;

import java.util.HashSet;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1805. 字符串中不同整数的数目
 * @date 2022/12/6 00:25:18
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().numDifferentIntegers("001a01"));
    }
    public int numDifferentIntegers(String word) {
        HashSet<String> hashSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (c >= '0' && c <= '9')
                sb.append(c);
            else if (sb.length() > 0){
                hashSet.add(zero(sb.toString()));
                sb = new StringBuilder();
            }
        }
        if (sb.length() > 0)
            hashSet.add(zero(sb.toString()));
        return hashSet.size();
    }
    public String zero(String s){
        int i = 0;
        while ( i < s.length() && s.charAt(i) == '0') {
            i++;
        }
        return s.substring(i);
    }
}
