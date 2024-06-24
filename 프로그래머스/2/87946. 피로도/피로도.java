import java.util.*;
class Solution {
    public static int answer = 0;
    public static boolean[] visit;
    public static int[][] arr;

    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];
        arr=dungeons;
        dfs(k, 0, arr.length);
        return answer;
    }
    
    private static void dfs(int hp, int cnt, int leng) {
        answer = Math.max(cnt, answer);
        for(int i = 0 ; i < leng ; i++){
            if(visit[i]) continue;
            if(hp < arr[i][0] || hp < arr[i][1]) continue;
            visit[i] = true;
            dfs(hp-arr[i][1] , cnt+1 , leng);
            visit[i] = false;
        }
    }
}