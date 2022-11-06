package week9;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 754. 到达终点数字
 * @date 2022/11/4 00:36:34
 */
public class Test5_1 {
    public static void main(String[] args) {
        System.out.println(new Test5_1().reachNumber(10));
    }

    public int reachNumber(int target) {
        int sum = 0;
        int index = 0;
        target = Math.abs(target);
        while(sum < target){
            index++;
            sum += index;
        }
        if(sum == target){
            return index;
        }
        
        while((sum - target) % 2 != 0){
            index++;
            sum += index;
        }
        return index;
    }

}
