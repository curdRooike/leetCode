package week6;

import java.util.HashSet;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 263. 丑数
 * @date 2022/10/14 15:12:52
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(new Test5().isUgly(8));
    }
    public boolean isUgly(int n) {
        if(n<1)
            return false;
        if(n==1)
            return true;
        for(int ele:new int[]{2,3,5})
        {
            if(n%ele==0)
                return isUgly(n/ele);
        }
        return false;
    }
}
