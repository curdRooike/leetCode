package week8;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 504. 七进制数
 * @date 2022/10/25 17:51:56
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().convertToBase7(0));
    }
    public String convertToBase7(int num) {
        int num1 = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while (num1 > 0){
            sb.append(num1 % 7);
            num1 /= 7;
        }
        if (sb.length() == 0)
            sb.append(0);
        return num >= 0 ? sb.reverse().toString() : "-"+sb.reverse().toString();
    }
}
