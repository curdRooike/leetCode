package week24;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 982. 按位与为零的三元组
 * @date 2023/3/5 21:12:58
 */
public class Test2 {
    public static void main(String[] args) {
        int []a = {2,1,3};
        System.out.println(new Test2().countTriplets(a));
    }
    public int countTriplets(int[] nums) {
        int[] cnt = new int[1 << 16];
        for (int x : nums)
            for (int y : nums)
                ++cnt[x & y];
        int ans = 0;
        for (int x : nums)
            for (int y = 0; y < 1 << 16; ++y)
                if ((x & y) == 0)
                    ans += cnt[y];
        return ans;
    }
    /*暴力
    public int countTriplets(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = j; k < nums.length; k++) {
                    if ((nums[i] & nums[j] & nums[k]) == 0) {
                        if (i == j && j == k)
                            count++;
                        else if (i == j || j == k)
                            count += 3;
                        else
                            count += 6;
                    }
                }
            }
        }
        return count;
    }*/
}
