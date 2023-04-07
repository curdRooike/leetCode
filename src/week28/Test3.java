package week28;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1053. 交换一次的先前排列
 * @date 2023/4/3 00:22:53
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Test3().
                prevPermOpt1(new int[]{1,3,1,2})));
    }

    public int[] prevPermOpt1(int[] arr) {
        int n = arr.length;
        int idx = n - 1;
        for (; idx > 0 ; --idx) {
            if (arr[idx] < arr[idx - 1]) {
                break;
            }
        }
       //System.out.println(idx);
        if (idx == 0) {
            return arr;
        }
        int idx1 = n - 1;
        // 12134569
       while (arr[idx1] >= arr[idx - 1] || arr[idx1] == arr[idx1 - 1]){
           idx1--;
       }

        int temp = arr[idx - 1];
        arr[idx - 1] = arr[idx1];
        arr[idx1] = temp;
        return arr;
    }
    /*public int[] prevPermOpt1(int[] arr) {
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                int j = n - 1;
                while (arr[j] >= arr[i] || arr[j] == arr[j - 1]) {
                    j--;
                }
                System.out.println(i);
                System.out.println(j);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                break;
            }
        }
        return arr;
    }*/

}
