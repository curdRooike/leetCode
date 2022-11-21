package week11;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1710. 卡车上的最大单元数
 * @date 2022/11/15 02:03:37
 */
public class Test1 {
    public static void main(String[] args) {
        int [][]a = {{1,3},{2,2},{3,1}};
        System.out.println(new Test1().maximumUnits(a, 4));
    }
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a1,a2) -> a2[1] - a1[1]);//降序
        int sum = 0;
        for (int[] boxType : boxTypes) {
            sum += boxType[1] * boxType[0];
            truckSize -= boxType[0];
            if (truckSize <= 0) {
                sum += truckSize * boxType[1];
                break;
            }
        }
        return sum;
    }
}
