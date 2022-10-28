package week8;

import java.util.ArrayDeque;
import java.util.HashMap;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 496. 下一个更大元素 I(单调栈)
 * @date 2022/10/28 12:23:44
 */
public class Test6 {
    public static void main(String[] args) {
        int []a = {4,1,2};
        int []b = {1,3,4,2};
        for (int i : new Test6().nextGreaterElement(a, b)) {
            System.out.print(i+"\t");
        }
    }
    /*public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(Integer.MAX_VALUE);
        for (int num : nums2) {
            while (stack.peek() < num)
                hashMap.put(stack.pop(),num);
            stack.push(num);
        }
        int ret[] = new int[nums1.length];
        for(int i = 0; i<nums1.length; i++){
            ret[i] = hashMap.getOrDefault(nums1[i], -1);
        }
        return ret;
    }*/
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = nums2.length - 1; i >= 0; --i) {
            int num = nums2[i];
            while (!stack.isEmpty() && num >= stack.peek())
                stack.pop();
            hashMap.put(num,stack.isEmpty() ? -1 : stack.peek());
            stack.push(num);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; ++i) {
            res[i] = hashMap.get(nums1[i]);
        }
        return res;
    }
}
