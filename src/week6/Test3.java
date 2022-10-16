package week6;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 350. 两个数组的交集 II
 * @date 2022/10/12 12:58:57
 */
public class Test3 {
    public static void main(String[] args) {
        int []a = {4,9,5};
        int []b = {9,4,9,8,4};
        int[] intersect = new Test3().intersect(a, b);
        for (int i : intersect) {
            System.out.println(i);
        }
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length, length2 = nums2.length;
        int[] intersection = new int[length1 + length2];
        int index = 0, index1 = 0, index2 = 0;
        while (index1 < length1 && index2 < length2) {
            int num1 = nums1[index1], num2 = nums2[index2];
            if (num1 == num2) {
                intersection[index++] = num1;
                index1++;
                index2++;
            } else if (num1 < num2) {
                index1++;
            } else {
                index2++;
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }
}
