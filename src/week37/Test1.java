package week37;

/**+
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2455. 可被三整除的偶数的平均值
 * @date 2023/5/29 00:02:17
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().
                averageValue(new int[]{1, 3, 6, 10, 12, 15}));
    }
    public int averageValue(int[] nums) {
        int count = 0, sum = 0;
        for (int num : nums) {
            if (num % 6 == 0){
                count++;
                sum += num;
            }
        }
        return count != 0 ? sum / count : 0;
    }
}
