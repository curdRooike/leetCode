package week2;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 最大交换
 * @date 2022/9/14 00:59:38
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().maximumSwap(8399368));
    }
    public int maximumSwap(int num) {
        char[] charArray = String.valueOf(num).toCharArray();
        int n = charArray.length;
        int maxIdx = n - 1;
        int idx1 = -1, idx2 = -1;
        for (int i = maxIdx - 1; i >= 0; i--) {
            if (charArray[i] > charArray[maxIdx]) {
                maxIdx = i;
            } else if (charArray[i] < charArray[maxIdx]) {
                idx1 = i;
                idx2 = maxIdx;
            }
        }
        if (idx1 >= 0) {
            swap(charArray, idx1, idx2);
            return Integer.parseInt(new String(charArray));
        } else {
            return num;
        }
    }
    private void swap(char[] chars,int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
