package week6;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 405. 数字转换为十六进制数
 * @date 2022/10/13 14:31:05
 */
public class Test4_5 {
    public static void main(String[] args) {
        System.out.println(new Test4_5().toHex(26));
    }
   /* public String toHex(int num) {
        if (num == 0)
            return "0";
        long num1 = num;
        StringBuilder sb = new StringBuilder();
        if(num < 0)
            num1 = (long)(Math.pow(2, 32) + num);
        while (num1 != 0) {
            long u = num1 % 16;
            char c = (char)(u + '0');
            if (u >= 10) c = (char)(u - 10 + 'a');
            sb.append(c);
            num1 /= 16;
        }
        return sb.reverse().toString();

    }*/
    public String toHex(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int u = num & 15;
            char c = (char)(u + '0');
            if (u >= 10) c = (char)(u - 10 + 'a');
            sb.append(c);
            num >>>= 4;
        }
        return sb.reverse().toString();
    }

}
