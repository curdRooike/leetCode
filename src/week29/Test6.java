package week29;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1157. 子数组中占绝大多数的元素
 * @date 2023/4/17 18:16:28
 */
public class Test6 {
    public static void main(String[] args) {
        MajorityChecker majorityChecker =
                new MajorityChecker(new int[]{1, 1, 2, 2, 1, 1});
        System.out.println(majorityChecker.query(0, 5, 4));
        System.out.println(majorityChecker.query(0, 3, 3));
        System.out.println(majorityChecker.query(2, 3, 2));
    }

}
class MajorityChecker {
    int []arr;
    public MajorityChecker(int[] arr) {
        this.arr = arr;
    }

    public int query(int left, int right, int threshold) {
        int[] map = new int[20001];
        for(int i = left; i <= right;i++) {
            if(++map[arr[i]] >= threshold) return arr[i];
        }
        return -1;
    }
}