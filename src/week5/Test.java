package week5;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 第五周测试类
 * @date 2022/10/5 13:23:04
 */
public class Test {
    public static void main(String[] args) {
      int []a = {5,4,3,1,5};
        for (int i : a) {
            System.out.print(i+"\t");
        }
        int i = 0;
        System.out.println();
        System.out.println(a.hashCode());
        ss(a,i);
    }
    public static int[] ss(int[]b,int i){
        Arrays.sort(b);
        System.out.println(b.hashCode());
        return b;
    }
}
