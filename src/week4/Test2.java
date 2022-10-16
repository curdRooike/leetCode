package week4;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 面试题 01.02. 判定是否互为字符重排
 * @date 2022/9/27 00:32:34
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().CheckPermutation("abc", "bad"));
    }
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length()!=s2.length())
            return false;
        int[] a = new int[128];
        int[] b = new int[128];
        for (char c : s1.toCharArray()) {
            a[c]++;
        }
        for (char c : s2.toCharArray()) {
            b[c]++;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
            System.out.println(b[i]);

        }
        System.out.println("============================");
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
            System.out.println(b[i]);
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
