package week15;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2042. 检查句子中的数字是否递增
 * @date 2023/1/3 16:26:40
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(new Test5().areNumbersAscending("1 box has 3 blue 4 red " +
                "6 green and 12 yellow marbles"));
    }
    public boolean areNumbersAscending(String s) {
        int n = s.length();
        int pre = -1, cur = 0;
        char c = ' ';
        for (int i = 0; i < n; i++) {
            char c1 = s.charAt(i);
            if (c1 == ' ') {
                if (c <= '9') {
                    if (cur <= pre) return false;
                    pre = cur;
                    cur = 0;
                }
            }else if (c1 <= '9'){
                cur = cur * 10 + (c1 - '0');
            }
            c = c1;
        }
        return c > '9' || cur > pre;
    }
}
