package week1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 杨辉三角二
 * @date 2022/9/10 23:19:48
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(new Test6().getRow(2));
    }
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            list.add(0);
            for (int j = i; j > 0 ; j--) {
                list.set(j,list.get(j-1) + list.get(j));
            }
        }
        return list;
    }
}
