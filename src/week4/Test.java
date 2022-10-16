package week4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 测试类
 * @date 2022/9/27 23:51:34
 */
public class Test {
    public static boolean isPalindrome(int x) {
        boolean result = false;
        if (x < 0 || x < -Math.pow(2,31) || x > Math.pow(2,31) - 1){
            result = false;
        } else if(x == 0){
            result = true;
        } else {
            int absNum = x;
            long newNum = 0;
            int size;
            List<Integer> num = new ArrayList<>();
            while(absNum != 0){
                num.add(absNum % 10);
                absNum /= 10;
            }
            size = num.size();
            for (int n : num){
                newNum += n * Math.pow(10,--size);
                System.out.println(newNum);
            }

            if(x == newNum){
                result = true;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int x = 2147483647;
        System.out.println(isPalindrome(x));
    }
}
