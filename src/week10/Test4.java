package week10;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 674. 最长连续递增序列
 * @date 2022/11/10 01:12:17
 */
public class Test4 {
    public static void main(String[] args) {
        int []a = {1,3,5,4,2,3,4,5};
        System.out.println(new Test4().findLengthOfLCIS(a));
    }
    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int max = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] >= nums[i+1]){
                max = Math.max(max,count);
                count = 1;
            }else {
                count++;
            }

        }
        return Math.max(max,count);
    }
}
