package week22;

import util.SoutUtil;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2347. 最好的扑克手牌
 * @date 2023/2/20 00:03:55
 */
public class Test4 {
    public static void main(String[] args) {
        int []a = {4,4,2,4,4};
        char []c = {'d','a','a','b','c'};
        System.out.println(new Test4().bestHand(a, c));
    }
    public String bestHand(int[] ranks, char[] suits) {
        int[] sHash = new int[4];
        for (char suit : suits) {
            sHash[suit - 'a']++;
        }
        for (int hash : sHash) {
            if (hash == 5) {
                return "Flush";
            }
        }
        int[] rHash = new int[13];
        for (int rank : ranks) {
            rHash[rank]++;
        }
        Arrays.sort(rHash);
        String res;
        res = rHash[rHash.length-1] > 2 ? "Three of a Kind" :
                rHash[rHash.length-1] > 1 ? "Pair" : "High Card";
        return res;
    }
}
