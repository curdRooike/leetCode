package week3;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 能否连接形成数组
 * @date 2022/9/22 08:26:23
 */
public class Test3 {
    public static void main(String[] args) {
        int []a = {15,88};
        int [][]b = {{88},{15}};
        System.out.println(new Test3().canFormArray(a, b));
    }
    public boolean canFormArray(int[] arr, int[][] pieces) {
        for (int i = 0; i < arr.length; ) {
            int idx = findIdx(arr[i], pieces);
            if (idx == -1)
                return false;
            for (int i1 = 0; i1 < pieces[idx].length; i1++) {
                if (arr[i+i1] != pieces[idx][i1])
                    return false;
            }
            i+=pieces[idx].length;
        }
        return true;

    }
    int findIdx(int a,int pieces[][]){
        for (int i = 0; i < pieces.length; i++) {
            if (pieces[i][0] == a) {
                return i;
            }
        }
        return -1;
    }
}
