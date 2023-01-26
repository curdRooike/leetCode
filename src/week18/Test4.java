package week18;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2303. 计算应缴税款总额
 * @date 2023/1/23 20:34:43
 */
public class Test4 {
    public static void main(String[] args) {
        int [][]a = {{3,50},{7,10},{12,25}};
        System.out.println(new Test4().calculateTax(a, 10));

    }
    public double calculateTax(int[][] brackets, int income) {
        double totalTax = 0;
        int lower = 0;
        for (int[] bracket : brackets) {
            int upper = bracket[0], percent = bracket[1];
            int tax = (Math.min(income, upper) - lower) * percent;
            totalTax += tax;
            if (income <= upper) {
                break;
            }
            lower = upper;
        }
        return totalTax / 100.0;
    }

}
