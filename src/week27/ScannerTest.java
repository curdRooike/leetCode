package week27;

import java.util.Scanner;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description
 * @date 2023/3/29 19:33:05
 */
public class ScannerTest {
   /* public static int maxSum(int[] nums) {//感觉可以dp
        int max = 0;
        int num = 0;
        int flag = 0;
        for(int i = 0; i < nums.length; i+=2){
            num += nums[i];
            flag++;
            if (flag == 3){
                max = Math.max(max,num);
                num = 0;
                flag = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(",");
        int[] ints = new int[s1.length];
        int i = 0;
        for (String s2 : s1) {
            ints[i++] = Integer.parseInt(s2);
        }
        System.out.println(maxSum(ints));
    }*/
   public static void main(String[] args) {
       int a = 2;
       int b = 1;
       int c = a + b > 3 ? a++:++b;
       System.out.println(b);
   }
}
