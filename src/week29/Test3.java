package week29;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1041. 困于环中的机器人
 * @date 2023/4/12 00:48:55
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().isRobotBounded("GGLLGG"));
    }

        public boolean isRobotBounded(String instructions) {
            int x = 0,y = 0;
            int direction = 0; // 0 1 2 3 分别代表北东南西
            for (int i = 0;i < instructions.length();i++) {
                char temp = instructions.charAt(i);
                if (temp == 'G') {
                    if (direction == 0) {
                        y++;
                    }else if (direction == 1) {
                        x++;
                    }else if (direction == 2) {
                        y--;
                    }else {
                        x--;
                    }
                }else {
                    if (temp == 'L') {
                        direction = (direction + 3)%4;
                    }else {
                        direction = (direction + 1)%4;
                    }
                }
            }
            if (x == 0 && y == 0) return true;
            return direction != 0;
        }
    }

