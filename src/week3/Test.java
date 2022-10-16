package week3;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 第三周测试类
 * @date 2022/9/19 14:17:35
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(new Test().addStrings("11", "123"));
    }
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || add != 0){
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = n1 + n2 + add;
            sb.append(result%10);
            add = result/10;
            i--;
            j--;
        }
        sb.reverse();
        return sb.toString();
    }
}
