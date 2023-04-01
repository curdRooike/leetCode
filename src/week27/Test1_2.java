package week27;

import util.SoutUtil;
import week26.Test7_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 22. 括号生成
 * @date 2023/3/26 01:02:44
 */
public class Test1_2 {
    public static void main(String[] args) {
        System.out.println(new Test1_2().generateParenthesis(2));
    }
    // 做减法
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0) {
            return res;
        }
        dfs("",n,n,res);
        return res;
    }
    /**
     * @param curStr 当前递归得到的结果
     * @param left   左括号还有几个可以使用
     * @param right  右括号还有几个可以使用
     * @param res    结果集
     */
    private void dfs(String curStr, int left, int right, List<String> res) {
        if (left == 0 && right == 0){
            res.add(curStr);
            return;
        }
        if (left > right) {
            return;
        }
        if (left > 0) {
            System.out.println("left:"+curStr + "(");
            System.out.println(left - 1);
            System.out.println(right);
            dfs(curStr + "(",left - 1,right,res);
        }
        if (right > 0) {
            System.out.println("right:"+curStr + ")");
            System.out.println(left);
            System.out.println(right - 1);
            dfs(curStr + ")",left,right - 1,res);
        }
    }
}
