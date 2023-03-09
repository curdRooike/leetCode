package week24;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1096. 花括号展开 II
 * @date 2023/3/7 10:36:03
 */
public class Test5 {

    public static void main(String[] args) {
        System.out.println(new Test5().braceExpansionII("{a,b}{c,{d,e}}"));
    }
    private TreeSet<String> s = new TreeSet<>();
    public List<String> braceExpansionII(String expression) {
        dfs(expression);
        return new ArrayList<>(s);
    }
    private void dfs(String exp) {
        int j = exp.indexOf("}");
        if (j == -1) {
            s.add(exp);
            return;
        }

        int i = exp.lastIndexOf('{', j);
        String a = exp.substring(0, i);
        String c = exp.substring(j + 1);
        for (String b : exp.substring(i + 1, j).split(",")) {
            //System.out.println(exp.substring(i + 1, j) + ": "+a + b + c);
            dfs(a + b + c);
        }
    }
}
