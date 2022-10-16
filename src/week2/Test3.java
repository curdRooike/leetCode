package week2;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 灯泡开关
 * @date 2022/9/15 08:06:58
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().flipLights(2, 4));
    }
    public int flipLights(int n, int presses) {
        //不按开关
        if (presses == 0) {
            return 1;
        }
        //特殊情况处理
        if (n == 1) {
            return 2;
        } else if (n == 2) {
            //特殊情况
            return presses == 1 ? 3 : 4;
        } else {
            //n >= 3
            return presses == 1 ? 4 : presses == 2 ? 7 : 8;
        }
    }
}
