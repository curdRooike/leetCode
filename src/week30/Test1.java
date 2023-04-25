package week30;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1042. 不邻接植花
 * @date 2023/4/18 11:55:17
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Test1().gardenNoAdj(3,
                new int[][]{{1, 2}, {2, 3}, {3, 1}})));
    }
    public int[] gardenNoAdj(int n, int[][] paths) {
        List<Integer>[] adj = new List[n];
        Arrays.setAll(adj,e -> new ArrayList<>());
        for (int[] path : paths) {
            adj[path[0] - 1].add(path[1] - 1);
            adj[path[1] - 1].add(path[0] - 1);
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            boolean[] colored = new boolean[5];
            for (int vertex : adj[i]) {
                colored[ans[vertex]] = true;
            }
            for (int j = 1; j <= 4; j++) {
                if (!colored[j]) {
                    ans[i] = j;
                    break;
                }
            }
        }
        return ans;
    }
}
