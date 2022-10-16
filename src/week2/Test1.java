package week2;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 删除数组后的大小取平均值
 * @date 2022/9/14 00:35:47
 */
public class Test1 {
    public static void main(String[] args) {
        int []a = new int[]{6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3};
        System.out.println(new Test1().trimMean(a));
    }
    public double trimMean(int[] arr) {
        int length = arr.length;
        Arrays.sort(arr);
        double num = 0;
        for (int i = length / 20; i < 19*length /20; i++) {
            num += arr[i];
        }
        return num / (length *0.9);
    }

}
