package week22;

import java.util.PriorityQueue;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1792. 最大平均通过率
 * @date 2023/2/19 00:54:02
 */
public class Test3 {
    public static void main(String[] args) {
        int[][] a = {{2,2},{1,2},{3,5}};
        System.out.println(new Test3().maxAverageRatio(a, 2));
    }
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        int n = classes.length;
        // 定义优先队列，优先级按照增加 1 名学生之后能够产生的最大贡献来排序
        PriorityQueue<double[]> queue = new PriorityQueue<>((o1, o2) -> {

            double x = ((o2[0] + 1) / (o2[1] + 1) - o2[0] / o2[1]);
            double y = ((o1[0] + 1) / (o1[1] + 1) - o1[0] / o1[1]);
            return Double.compare(x, y);
        });
        // 转化为 double，方便小数计算
        for (int[] c : classes) {

            queue.offer(new double[]{c[0], c[1]});
        }
        // 分配学生，每次分配 1 名
        while (extraStudents > 0) {
            double[] maxClass = queue.poll(); //取出能够产生最大影响的班级
            maxClass[0] += 1.0; //通过的人数
            maxClass[1] += 1.0; //班级总人数

            queue.offer(maxClass); //将更新后的重新加入队列中
            extraStudents--;
        }
        // 计算最终结果
        double res = 0;
        while (!queue.isEmpty()) {
            double[] c = queue.poll();
            res += (c[0] / c[1]);
        }
        return res / n;
    }
}
