package greedyAlgorithm;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 561. 数组拆分
 * @date 2023/3/28 22:23:48
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().isValid("()[]{}"));
    }
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }
        HashMap<Character, Character> hash = new HashMap<Character,Character>(){{
            put(')','(');
            put('}','{');
            put(']','[');
        }};
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (hash.containsKey(c)) {
                if (stack.isEmpty() || stack.peek() != hash.get(c))
                    return false;
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
