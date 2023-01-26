package week18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1817. 查找用户活跃分钟数
 * @date 2023/1/20 00:13:22
 */
public class Test1 {
    public static void main(String[] args) {
        int [][] a = {{0,5},{1,2},{0,2},{0,5},{1,3}};
        new Test1().findingUsersActiveMinutes(a,5);
    }
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> activeMinutes = new HashMap<Integer, Set<Integer>>();
        for (int[] log : logs) {
            int id = log[0], time = log[1];
            activeMinutes.putIfAbsent(id, new HashSet<>());
            activeMinutes.get(id).add(time);
        }
        System.out.println(activeMinutes);
        int[] answer = new int[k];
        for (Set<Integer> value : activeMinutes.values()) {
            answer[value.size() -1 ]++;
        }
        return answer;
    }
}
