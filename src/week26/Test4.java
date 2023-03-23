package week26;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2469. 温度转换
 * @date 2023/3/21 10:45:54
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Test4().convertTemperature(36.50)));
    }
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}
