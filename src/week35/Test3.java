package week35;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2446. 判断两个事件是否存在冲突
 * @date 2023/5/17 22:53:56
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().haveConflict(
                new String[]{"10:00","11:00"}
                , new String[]{"14:00","15:00"}));
    }
    public boolean haveConflict(String[] event1, String[] event2) {
        System.out.println(event1[1].compareTo(event2[0]) < 0);

        System.out.println(event2[1].compareTo(event1[0]) < 0);
        return !(event1[1].compareTo(event2[0]) < 0 || event2[1].compareTo(event1[0]) < 0);

    }
}
