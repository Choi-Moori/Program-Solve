class Solution {
    int answer = Integer.MAX_VALUE;
    boolean[][][] visit;
    public int solution(int[][] info, int n, int m) {

        int max = 121;
        visit = new boolean[info.length+1][max][max];
        
        dfs(info, 0, n, m, 0, 0);
        
        return answer>=n ? -1 : answer;
    }
    
    public void dfs(int[][] info, int depth, int n, int m, int a, int b){
        if( a >= n || b >= m) return;
        
        if(visit[depth][a][b]) return;
        visit[depth][a][b] = true;
        
        if(depth == info.length){
            answer = Math.min(answer, a);
            return;
        }
        
        dfs(info, depth +1, n, m, a + info[depth][0], b);
        
        dfs(info, depth +1, n, m, a, b + info[depth][1]);
    }
}