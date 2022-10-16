package week1;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 商品折后的最终价格
 * @date 2022/9/8 08:08:00
 */
public class Test2 {
    public static void main(String[] args) {
        int []a = {8,4,6,2,3};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        new Test2().finalPrices(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
    }
    public int[] finalPrices(int[] prices) {
        int []returnArray = prices;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    returnArray[i] -= prices[j];
                    break;
                }
            }
        }
        return returnArray;
    }
}
