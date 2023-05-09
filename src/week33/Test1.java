package week33;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2432. 处理用时最长的那个任务的员工
 * @date 2023/5/5 21:01:58
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().hardestWorker(10,
                new int[][]{{0,3},{2,5},
                {0,9},{1,15}}));
    }
    public int hardestWorker(int n, int[][] logs) {
        int max = logs[0][1];
        int id = logs[0][0];
        for (int i = 1; i < logs.length; i++) {
            int num = logs[i][1] - logs[i - 1][1];
            if (max == num) {
                id = Math.min(id, logs[i][0]);
            }else if (max < num)
                id = logs[i][0];
            max = Math.max(max, num);
        }
        return id;
    }
}
