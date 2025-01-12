import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visit = new boolean[n];
        
        List<List<Integer>> adjList = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++){
            adjList.add(new ArrayList<>());
        }
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(j != i && computers[i][j] == 1){
                    adjList.get(i).add(j);
                }
            }
        }
        
        for(int i = 0 ; i < n ; i++){
            if(!visit[i]){
                dfs(visit, i, adjList);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(boolean[] visit, int start, List<List<Integer>> adjList){
        visit[start] = true;
        for(int i : adjList.get(start)){
            if(!visit[i]){
                dfs(visit, i, adjList);
            }
        }
        
    }
}