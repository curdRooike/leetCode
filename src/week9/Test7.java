package week9;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1678. 设计 Goal 解析器
 * @date 2022/11/6 23:01:22
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().interpret("G()(al)"));
    }
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                sb.append('G');
            }else if(command.charAt(i) == '('){
                if (command.charAt(i + 1) == ')') {
                    sb.append("o");
                } else {
                    sb.append("al");
                }
            }
        }
        return sb.toString();
    }
}
