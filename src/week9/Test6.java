package week9;

import java.util.ArrayDeque;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1106. 解析布尔表达式(第一次困难题)
 * @date 2022/11/5 17:55:53
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(new Test6().parseBoolExpr("|(&(t,f,t),!(t))"));
    }
    public boolean parseBoolExpr(String expression) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == ',') {
            }
            else if (c != ')'){
                stack.push(c);
            }
            else {
                int t = 0,f = 0;
                char va;
                while ((va = stack.pop() )!= '(') {
                    if (va == 't')
                        t++;
                    else
                        f++;
                }
                char pop = stack.pop();
                switch (pop) {
                    case '!':
                        stack.push(f == 1 ? 't' : 'f');
                        break;
                    case '&':
                        stack.push(f == 0 ? 't' : 'f');
                        break;
                    case '|':
                        stack.push(t > 0 ? 't' : 'f');
                        break;
                    default:
                }
            }
        }
        return stack.pop() == 't';
    }
}
