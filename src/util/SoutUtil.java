package util;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 引用类型输出控制台工具类
 * @date 2022/11/3 10:36:10
 */
public class SoutUtil {
    public static void ArrayOut(int[] a) {
        for (int i : a) {
            System.out.print(i+"\t");
        }
        System.out.println();
    }
}
