package week8;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 907. 子数组的最小值之和
 * @date 2022/10/28 13:03:15
 */
public class Test7 {
    public static void main(String[] args) {
        int []a = {3,1,2,4};
        System.out.println(new Test7().sumSubarrayMins(a));
    }
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Deque<Integer> monoStack = new ArrayDeque<>();
        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 0; i < n; i++) {
            while (!monoStack.isEmpty() && arr[i] <= arr[monoStack.peek()]) {
                monoStack.pop();
            }
            left[i] = i - (monoStack.isEmpty() ? -1 : monoStack.peek());
            monoStack.push(i);
        }
        System.out.println("left:"+monoStack);
        for (int i : left) {
            System.out.print(i+"\t");
        }
        System.out.println();
        monoStack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!monoStack.isEmpty() && arr[i] < arr[monoStack.peek()]) {
                monoStack.pop();
            }
            right[i] = (monoStack.isEmpty() ? n : monoStack.peek()) - i;
            monoStack.push(i);
        }
        System.out.println("right:"+monoStack);
        for (int i : right) {
            System.out.print(i+"\t");
        }
        System.out.println();
        long ans = 0;
        final int MOD = 1000000007;
        for (int i = 0; i < n; i++) {
            ans = (ans + (long) left[i] * right[i] * arr[i]) % MOD;
        }
        return (int) ans;
    }



}
