package week7;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1700. 无法吃午餐的学生数量
 * @date 2022/10/19 12:36:42
 */
public class Test3 {
    public static void main(String[] args) {
        int []a = {1,1,0,0};
        int []b = {0,1,0,1};
        System.out.println(new Test3().countStudents(a, b));
    }
    public int countStudents(int[] students, int[] sandwiches) {
        int[] hash = new int[2];
        for (int i : students) {
            hash[i]++;
        }
        for (int i = 0; i < sandwiches.length; i++) {
            if (--hash[sandwiches[i]] == -1)
                return sandwiches.length - i;
        }
        return 0;
    }
}
