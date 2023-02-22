package week22;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1237. 找出给定方程的正整数解
 * @date 2023/2/18 00:06:27
 */
interface CustomFunction {
    int f(int x, int y);
}
public class Test2 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> res = new ArrayList<>();
        for (int x = 1; x <= 1000; x++) {
            int yleft = 1, yright = 1000;
           while (yleft < yright){
               int ymiddle = (yleft + yright) / 2;
                if (customfunction.f(x, ymiddle) == z) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(x);
                    pair.add(ymiddle);
                    res.add(pair);
                    break;
                } if (customfunction.f(x, ymiddle) > z) {
                   yright = ymiddle - 1;
               } else {
                   yleft = ymiddle + 1;
               }
            }
        }
        return res;
    }
}
