package week32;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1232. 缀点成线
 * @date 2023/4/30 01:17:44
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().checkStraightLine(new int[][]{
                {}
        }));
    }
    public boolean checkStraightLine(int[][] coordinates) {
        for(int i = 2;i < coordinates.length;i++){
            int[] a = {coordinates[i - 1][0] - coordinates[i - 2][0],
                    coordinates[i - 1][1] - coordinates[i - 2][1]};
            int[] b = {coordinates[i][0] - coordinates[i - 2][0],
                    coordinates[i][1] - coordinates[i - 2][1]};
            if(a[0] * b[1] - a[1] * b[0] != 0)
                return false;
        }
        return true;
    }

}
