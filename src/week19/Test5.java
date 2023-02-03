package week19;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2319. 判断矩阵是否是一个 X 矩阵
 * @date 2023/1/31 10:31:18
 */
public class Test5 {
    public static void main(String[] args) {
        int[][] a = {{2, 0, 0, 1}, {0, 3, 1, 0}, {0, 5, 2, 0}, {4, 0, 0, 2}};
        System.out.println(new Test5().checkXMatrix(a));
    }

    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == j || (i + j) == (n - 1)) {
                    if (grid[i][j] == 0)
                        return false;
                } else if (grid[i][j] != 0)
                    return false;

            }
        }
        return true;
    }
}