package week5;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 374. 猜数字大小(二分查找)
 * @date 2022/10/5 21:59:24
 */
/*
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int mid = 0;
        while(left <= right){
            mid = (right - left) / 2 + left;
            if(guess(mid) == 0){
                return mid;
            }if(guess(mid) == -1){
                right = mid - 1;
            }if(guess(mid) == 1){
                left = mid + 1;
            }
        }
        return mid;
    }


}*/
