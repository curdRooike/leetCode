package week12;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1779. 找到最近的有相同 X 或 Y 坐标的点
 * @date 2022/12/1 14:24:41
 */
public class Test5 {
    public static void main(String[] args) {
        int [][] a = {{1,2},{3,1},{2,4},{2,3},{4,4}};
        System.out.println(new Test5().nearestValidPoint(3, 4, a));
    }
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE;
        int p = -1;
        for (int i = 0; i < points.length; i++) {
            int x1 = points[i][0], y1 = points[i][1];
            if (x == x1 || y == y1){
                if (min > Math.abs((x - x1) + (y1 - y))){
                    min = Math.abs((x - x1) + (y1 - y));
                    p = i;
                }
            }
        }
        return p;
    }
}
