package week2;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description EASY
 * @date 2022/9/16 01:37:47
 */
public class Test4 {
    public static void main(String[] args) {
        String []s = {"a","a"};
        System.out.println(new Test4().countPrefixes(s, "aa"));
    }
    public int countPrefixes(String[] words, String s) {
        int sum = 0;
        for (String word : words) {
            if (s.startsWith(word)){
                sum ++;
            }
        }
        return sum;
    }
}
