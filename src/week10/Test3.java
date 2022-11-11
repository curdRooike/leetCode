package week10;

import java.util.ArrayDeque;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 844. 比较含退格的字符串
 * @date 2022/11/9 00:49:25
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().backspaceCompare("ab#c", "ad#c"));
    }
    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (S.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }
            while (j >= 0) {
                if (T.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }
            if (i >= 0 && j >= 0) {
                if (S.charAt(i) != T.charAt(j)) {
                    return false;
                }
            } else {
                if (i >= 0 || j >= 0) {
                    return false;
                }
            }
            i--;
            j--;
        }
        return true;
    }

    /*public boolean backspaceCompare(String s, String t) {
        ArrayDeque<Character> stack1 = new ArrayDeque<>();
        ArrayDeque<Character> stack2 = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#' ) {
                stack1.push(s.charAt(i));

            }else if (!stack1.isEmpty()){
                stack1.pop();
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '#' ) {
                stack2.push(t.charAt(i));

            }else if (!stack2.isEmpty()){
                stack2.pop();
            }
        }
        System.out.println(stack1);
        System.out.println(stack2);
        if (stack1.size()!=stack2.size()) {
            return false;
        }
        int n = stack1.size();
        for (int i = 0; i < n; i++) {
            if (stack1.pop() != stack2.pop()) {
                return false;
            }
        }

        return true;
    }*/
}
