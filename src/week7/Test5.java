package week7;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 605. 种花问题
 * @date 2022/10/21 10:10:53
 */
public class Test5 {
    public static void main(String[] args) {
        int []a = {0,0,1,0,1};
        System.out.println(new Test5().canPlaceFlowers(a, 1));
    }
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == length-1 || flowerbed[i+1] == 0)){
                n--;
                //把花种上
                flowerbed[i] = 1;
            }
            if (n <= 0){
                return true;
            }
        }
        return false;
    }
}
