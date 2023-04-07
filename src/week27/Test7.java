package week27;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2367. 算术三元组的数目
 * @date 2023/3/31 00:04:59
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().arithmeticTriplets(new int[]{0, 1, 4, 6, 7, 10}, 3));
    }
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1;j < nums.length;j++){
                if (nums[j] - nums[i] != diff){
                    continue;
                }
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[k] - nums[j] == diff) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
