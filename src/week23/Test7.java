package week23;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 面试题 05.02. 二进制数转字符串
 * @date 2023/3/2 12:01:37
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().printBin(0.1));
    }

    /**
     * 打印本
     *
     * @param num 全国矿工工会
     * @return {@link String}
     */
    public String printBin(double num) {
        StringBuilder sb = new StringBuilder("0.");
        int flag = 0;
        while (num > 0) {
            System.out.println(sb);
            num *=2;
            if (num >= 1){
                sb.append((num+"").charAt(0));
                num -= 1;
            }else {
                sb.append(0);
            }
            if (++flag == 7) {
                return "ERROR";
            }
        }
        return sb.toString();
    }
}
