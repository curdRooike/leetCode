package week8;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 496. 下一个更大元素 I
 * @date 2022/10/28 12:21:01
 */
public class Test5 {
    public static void main(String[] args) {
        int []a = {4,1,2};
        int []b = {1,3,4,2};
        for (int i : new Test5().nextGreaterElement(a, b)) {
            System.out.print(i+"\t");
        }
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] res = new int[m];
        for (int i = 0; i < m; ++i) {
            int j = 0;
            while (j < n && nums2[j] != nums1[i]) {
                ++j;
            }
            int k = j + 1;
            while (k < n && nums2[k] < nums2[j]) {
                ++k;
            }
            res[i] = k < n ? nums2[k] : -1;
        }
        return res;
    }
}
