package week26;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1616. 分割两个字符串得到回文串
 * @date 2023/3/18 21:03:24
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().checkPalindromeFormation("abdef", "fecab"));
    }
    public boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check(b, a);
    }

    // 如果 a_prefix + b_suffix 可以构成回文串则返回 true，否则返回 false
    private boolean check(String a, String b) {
        int i = 0, j = a.length() - 1; // 相向双指针
        while (i < j && a.charAt(i) == b.charAt(j)) { // 前后缀尽量匹配
            ++i;
            --j;
        }
        System.out.println(a + i+"->"+j+":"+a.substring(i,j+1));
        System.out.println(b + i+"->"+j+":"+b.substring(i,j+1));
        return isPalindrome(a, i, j) || isPalindrome(b, i, j);
    }

    // 如果从 s[i] 到 s[j] 是回文串则返回 true，否则返回 false
    private boolean isPalindrome(String s, int i, int j) {
        while (i < j && s.charAt(i) == s.charAt(j)) {
            ++i;
            --j;
        }
        return i >= j;
    }

}
