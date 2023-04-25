package week30;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2418. 按身高排序
 * @date 2023/4/25 10:16:51
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Test6().sortPeople(new String[]{"Mary", "John", "Emma"}
                , new int[]{180, 165, 170})));
    }
    /*public String[] sortPeople(String[] names, int[] heights) {
        return Stream.iterate(0,i -> i+1)
                .limit(names.length)
                .sorted(Comparator.<Integer>comparingInt(i -> heights[i]).reversed())
                .map(i -> names[i])
                .toArray(String[]::new);
    }*/
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Integer[] id = new Integer[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
        Arrays.sort(id,(a,b) -> heights[b] - heights[a]);
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = names[id[i]];
        }
        return  res;
    }
}
