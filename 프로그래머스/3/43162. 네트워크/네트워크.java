import java.util.*;

class Solution {
    static int res = 0;
    static boolean[] visit;
    static List<List<Integer>> adjList;
    
    public int solution(int n, int[][] computers) {
        
        adjList = new ArrayList<>();
        visit = new boolean[n];
        for(int i = 0 ; i < n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int i = 0 ; i < n; i++){
            for(int k = 0 ; k < n; k++){
                if(k != i && computers[i][k] == 1){
                    adjList.get(i).add(k);
                }
            }
        }
        
        for(int i = 0 ; i < n ; i++){
            if(!visit[i]){
                dfs(i);
                res++;
            }
        }

        return res;
    }
    
    public static void dfs(int start){
        visit[start] = true;
        for(int i : adjList.get(start)){
            if(!visit[i]) {
                dfs(i);
            }
        }
    }
}