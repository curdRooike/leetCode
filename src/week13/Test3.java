package week13;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1812. 判断国际象棋棋盘中一个格子的颜色
 * @date 2022/12/8 12:47:34
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().squareIsWhite("a1"));
    }
    public boolean squareIsWhite(String coordinates) {
        return ((coordinates.charAt(0) - 'a' + 1) + (coordinates.charAt(1) - '0')) % 2 == 1;
    }
}
