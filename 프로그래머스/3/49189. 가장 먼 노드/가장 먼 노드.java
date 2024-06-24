import java.util.*;

class Solution {
    static boolean[] visit;
    static List<List<Integer>> adjList;
    static Queue<Integer> queue;
    static int[] dp;
    
    public int solution(int n, int[][] edge) {
        int answer = 0;
        visit = new boolean[n+1];
        Arrays.fill(visit, true);
        adjList = new ArrayList<>();
        dp = new int[n+1];

        for (int i = 0; i < n+1; i++)
            adjList.add(new ArrayList<>());
        for (int i = 0; i < n+1; i++) {
            for (int[] j : edge)
                if (j[0] == i) {
                    adjList.get(i).add(j[1]);
                    adjList.get(j[1]).add(i);
                }
        }

        queue = new LinkedList<>();
        bfs(1);
        Arrays.sort(dp);
        System.out.println(Arrays.toString(dp));
        int count = 1;
        for(int i = n-1 ; i > 0 ; i--){
            if(dp[i] != dp[n])
                break;
            count++;
        }
        return count;
    }

    static public void bfs(int start){
        queue.add(start);
        visit[start] = false;
        while(!queue.isEmpty()){
            int temp = queue.poll();
            for(int target : adjList.get(temp)){
                if(visit[target]){
                    dp[target] = dp[temp] + 1;
                    queue.add(target);
                    visit[target] = false;
                }
            }
        }
    }
}