package week18;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1331. 数组序号转换
 * @date 2023/1/24 23:19:30
 */
public class Test6 {
    public static void main(String[] args) {
        int []a = {40,10,20,30};
        System.out.println(Arrays.toString(new Test6().arrayRankTransform(a)));
    }
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] sorted = Arrays.copyOf(arr, n);
        Arrays.sort(sorted);
        HashMap<Integer, Integer> val2rank = new HashMap<>();
        for (int x : sorted)
            val2rank.putIfAbsent(x, val2rank.size() + 1);
        for (int i = 0; i < n; i++) {
            arr[i] = val2rank.get(arr[i]);
        }
        return arr;
    }
}
