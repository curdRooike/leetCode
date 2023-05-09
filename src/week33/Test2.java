package week33;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2106. 摘水果
 * @date 2023/5/5 22:08:50
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2()
                .maxTotalFruits(new int[][]{{0, 3}, {6, 4}, {8, 5}}, 3, 2));
    }
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int left = lowerBound(fruits, startPos - k); // 向左最远能到 fruits[left][0]
        System.out.println(left);
        int right = left, s = 0, n = fruits.length;
        for (; right < n && fruits[right][0] <= startPos; right++)
            s += fruits[right][1]; // 从 fruits[left][0] 到 startPos 的水果数
        int ans = s;
        for (; right < n && fruits[right][0] <= startPos + k; right++) {
            s += fruits[right][1]; // 枚举最右位置为 fruits[right][0]
            while (fruits[right][0] * 2 - fruits[left][0] - startPos > k &&
                    fruits[right][0] - fruits[left][0] * 2 + startPos > k)
                s -= fruits[left++][1]; // fruits[left][0] 无法到达
            ans = Math.max(ans, s); // 更新答案最大值
        }
        return ans;
    }

    // 见 https://www.bilibili.com/video/BV1AP41137w7/
    private int lowerBound(int[][] fruits, int target) {
        int left = -1, right = fruits.length; // 开区间 (left, right)
        while (left + 1 < right) { // 开区间不为空
            // 循环不变量：
            // fruits[left][0] < target
            // fruits[right][0] >= target
            int mid = (left + right) >>> 1;
            if (fruits[mid][0] < target)
                left = mid; // 范围缩小到 (mid, right)
            else
                right = mid; // 范围缩小到 (left, mid)
        }
        return right;
    }
}
