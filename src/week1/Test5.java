package week1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 杨辉三角
 * @date 2022/9/10 22:17:41
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(new Test5().generate(5));
    }
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> lists = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> add = new ArrayList<>();
            for (int j = 0; j <= i ; j++) {
                if (j == 0 || i == j){
                    add.add(1);
                }else {
                    add.add(lists.get(i-1).get(j-1)+lists.get(i-1).get(j));
                }
            }
            lists.add(add);
        }
        return lists;
    }
}
