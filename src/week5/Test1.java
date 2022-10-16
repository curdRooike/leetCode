package week5;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1784. 检查二进制字符串字段
 * @date 2022/10/5 13:23:46
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().checkOnesSegment("1010101"));
    }
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
