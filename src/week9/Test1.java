package week9;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 481. 神奇字符串
 * @date 2022/10/31 15:19:22
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().magicalString(6));
    }
    public int magicalString(int n) {
        char[] s = new char[n + 2];
        s[0] = 1; s[1] = s[2] = 2;
        char c = 2;
        for (int i = 2, j = 3; j < n; ++i) {
            c ^= 3;
            s[j++] = c;
            if (s[i] == 2)
                s[j++] = c;
        }
        for (char c1 : s) {
            System.out.println((c1+48)-48);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += 2 - s[i];
        }
        return ans;
    }
}
