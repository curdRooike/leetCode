package week17;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 704. 二分查找
 * @date 2023/1/18 14:39:52
 */
public class Test6 {
    public static void main(String[] args) {
        int []a = {8};
        new Test6().search(a,8);
    }
    public int search(int[] nums, int target) {
        int left = 0,right = nums.length - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            System.out.println(mid);
            int num = nums[mid];
            if (num == target) {
                System.out.println(mid);
                return mid;
            }else if(num > target)
                right = mid -1;
            else {
                left = mid + 1;
            }
        }
        return - 1;
    }
}
