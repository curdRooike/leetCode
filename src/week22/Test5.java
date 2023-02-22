package week22;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 240. 搜索二维矩阵 II
 * @date 2023/2/21 00:06:02
 */
public class Test5 {
    public static void main(String[] args) {
        int [][]a = {{1,4,7,11,15},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(new Test5().searchMatrix(a, 6));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            if (search(ints,target) >= 0) {
                return true;
            }
        }
        return false;
    }
    public int search(int[] nums, int target) {
        int low = 0,high = nums.length-1;
        while (low <= high){
            int mid = (high - low) / 2 + low;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
