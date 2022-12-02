package week12;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1742. 盒子中小球的最大数量
 * @date 2022/11/24 15:54:43
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().countBalls(1, 10));
    }
    public int countBalls(int l, int r) {
        int ans = 0;
        int[] cnts = new int[46];
        for (int i = l; i <= r; i++) {
            int j = i, cur = 0;
            while (j != 0) {
                cur += j % 10;
                j /= 10;
            }
            if (++cnts[cur] > ans)
                ans = cnts[cur];
        }
        return ans;
    }

}
