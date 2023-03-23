package week26;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 17. 电话号码的字母组合(回溯)
 * @date 2023/3/23 13:15:58
 */
public class Test6_1 {
    public static void main(String[] args) {
        System.out.println(new Test6_1().letterCombinations("23"));
    }
    private static final String[] MAPPING = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    private final List<String> ans = new ArrayList<>();
    private char[] digits, path;

    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        if (n == 0) return ans;
        this.digits = digits.toCharArray();
        path = new char[n];
        dfs(0);
        return ans;
    }
    private void dfs(int i) {
        if (i == digits.length) {
            ans.add(new String(path));
            return;
        }
        for (char c : MAPPING[digits[i] - '0'].toCharArray()) {
            System.out.println(MAPPING[digits[i] - '0'].toCharArray());
            path[i] = c;
            dfs(i + 1);
        }
    }
}
