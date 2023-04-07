package week28;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1017. 负二进制转换
 * @date 2023/4/6 00:11:08
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(new Test6().baseNeg2(2));
    }
    public String baseNeg2(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int a = Math.abs(n % (-2));
            //System.out.println(a);
            n = (n - a) / -2;
            sb.append(a);
        }
        return sb.reverse().toString();
    }
}
