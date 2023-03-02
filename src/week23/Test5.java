package week23;

import java.util.*;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2363. 合并相似的物品
 * @date 2023/2/28 10:11:25
 */
public class Test5 {
    public static void main(String[] args) {
        int [][]a = {{1,1},{4,5},{3,8}};
        int [][]b ={{3,1},{1,5}};
        System.out.println(new Test5().mergeSimilarItems(a, b));
    }

    /**
     * 合并相似项目
     *
     * @param items1 items1
     * @param items2 items2
     * @return {@link List}<{@link List}<{@link Integer}>>
     */
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int[] ints : items1) {
            hashMap.put(ints[0],hashMap.getOrDefault(ints[0],
                    0)+ints[1]);
        }
        for (int[] ints : items2) {
            hashMap.put(ints[0],hashMap.getOrDefault(ints[0],
                    0)+ints[1]);
        }
        //System.out.println(hashMap);
        List<List<Integer>> res = new ArrayList<>();
        //System.out.println(hashMap.keySet());
        /*for (int i = 0; i < 2; i++) {
            List<Integer> list = new ArrayList<>();
            list.add()
        }*/

        int[] hash = new int[hashMap.keySet().size()];
        int i = 0;
        for (Integer integer : hashMap.keySet()) {
            hash[i++] = integer;
        }
        Arrays.sort(hash);
        for (int integer : hash) {
            List<Integer> list = new ArrayList<>();
            list.add(integer);
            list.add(hashMap.get(integer));
            res.add(list);
        }
        return res;
    }
}
