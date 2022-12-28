package week14;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 转换字符串的最少操作次数
 * @date 2022/12/27 12:28:53
 */
public class Test6 {
    public static void main(String[] args) {

    }
    public int minimumMoves(String s) {
        int covered = -1, res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X' && i > covered) {
                res++;
                covered = i + 2;
            }
        }
        return res;


    }
}
