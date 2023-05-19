package week35;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1079. 活字印刷
 * @date 2023/5/19 10:24:21
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(new Test6().numTilePossibilities("AAB"));
    }

    int sum = 0;


    public int numTilePossibilities(String tiles) {
        int[] let = new int[26];
        int m = 0;
        for(int i=0; i<tiles.length(); i++){
            if(let[tiles.charAt(i) - 'A']++ == 0) m++;
        }
        int[] res = new int[m];
        for(int i=0, j= 0; i<26 && j<m; i++){
            if(let[i] != 0) res[j++] = let[i];
        }
        return dfs(res);
    }
    private int dfs(int[] res){
        int m = 0;
        for(int i=0; i<res.length; i++){
            if(res[i] == 0) continue;
            res[i]--;
            m += dfs(res) + 1;
            res[i]++;
        }
        return m;
    }
}