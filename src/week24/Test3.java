package week24;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1599. 经营摩天轮的最大利润
 * @date 2023/3/6 01:31:28
 */
public class Test3 {
    public static void main(String[] args) {
        int []a = {10,10,1,0,0};
        System.out.println(new Test3().minOperationsMaxProfit(a, 4, 4));
    }
   //  直接遍历
   public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        int person = 0,max = 0,money = 0;
        int res = -1;
        for (int i = 0; i < customers.length || person > 0; i++) {
            if (customers.length > i) {
                person += customers[i];
            }
            money += Math.min(person , 4) * boardingCost - runningCost;
            System.out.print(i +1+"\t"); System.out.println(money);
            person -= Math.min(person , 4);
            if (money > max) {
                max = money;
                res = i + 1;
            }
        }
        return res;
    }
   /* public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        int person = 0,max = 0,money = 0;
        int res = -1;
        for (int i = 0; i < customers.length; i++) {
            person += customers[i];
            money += Math.min(person , 4) * boardingCost - runningCost;
            person -= Math.min(person , 4);
            if (money > max) {
                max = money;
                res = i + 1;
            }
        }
        if (person == 0)
            return res;

    }*/
}
