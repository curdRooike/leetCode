package week11;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 121. 买卖股票的最佳时机
 * @date 2022/11/17 01:05:10
 */
public class Test3 {
    public static void main(String[] args) {
        int []a = {7,6,4,3,1};
        System.out.println(new Test3().maxProfit(a));
    }
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;

    }
}
