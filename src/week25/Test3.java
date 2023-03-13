package week25;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2383. 赢得比赛需要的最少训练时长
 * @date 2023/3/13 13:51:35
 */
public class Test3 {
    public static void main(String[] args) {
        int []a = {1,1,1,1};
        int []b = {1,1,1,50};
        System.out.println(new Test3().minNumberOfHours(1, 1, a, b));
    }
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
         int study = 0;
        for (int i : energy) {
            study += i;
        }
        study = study >= initialEnergy ? study - initialEnergy + 1 : 0;

        for (int j : experience) {
            if (initialExperience <= j) {
                study += j - initialExperience + 1;
                initialExperience = 2 * j + 1;
            }else {
                initialExperience += j;
            }
        }
        return study;
    }
}
