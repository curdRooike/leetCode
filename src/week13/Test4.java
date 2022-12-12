package week13;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1780. 判断一个数字是否可以表示成三的幂的和
 * @date 2022/12/9 14:27:09
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Test4().checkPowersOfThree(12));
    }
    public boolean checkPowersOfThree(int n) {
        while (n != 0){
            if (n % 3 == 2) { // 三的余数，0,1,2。只有2不符合要求
                return false;
            }
            n /= 3;
        }
        return true;
    }

}
