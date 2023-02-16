package week21;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1138. 字母板上的路径
 * @date 2023/2/12 01:43:42
 */
public class Test3 {
    public static void main(String[] args) {
        new Test3().alphabetBoardPath("code");
    }
    public String alphabetBoardPath(String target) {
        StringBuilder sv = new StringBuilder();
        int x = 0,y = 0;
        for (char c : target.toCharArray()) {
            int nx = (c - 'a') / 5,ny = (c - 'a') % 5;
            StringBuilder v = new StringBuilder();
            StringBuilder h = new StringBuilder();
            if(x > nx){
                int time = x - nx;
                while (time > 0) {
                    v.append("u");
                    time--;
                }
            }else {
                int time = nx - x;
                while (time > 0) {
                    v.append("D");
                    time--;
                }
            }
            if(y > ny){
                int time = y - ny;
                while (time > 0) {
                    h.append("L");
                    time--;
                }
            }else {
                int time = ny - y;
                while (time > 0) {
                    h.append("R");
                    time--;
                }
            }
            sv.append(c != 'z' ? v.toString()+h.toString():h.toString()+v.toString()).append("!");
        }
        return sv.toString();
    }
}
