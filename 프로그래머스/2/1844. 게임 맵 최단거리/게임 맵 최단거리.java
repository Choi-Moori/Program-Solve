import java.util.*;

class Solution {
    static int n;
    static int m;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    
    static boolean visit[][];
    public int solution(int[][] maps) {
        int answer = 0;
        n = maps.length;
        m = maps[0].length;
        visit = new boolean[n][m];
        
        Queue<int[]> queue = new LinkedList<>();
        
        queue.offer(new int[]{0,0,1});
        
        answer = bfs(maps, queue);
        return answer;
    }
    
    public int bfs(int[][] maps, Queue<int[]> queue){
        while(!queue.isEmpty()){
            int[] temp = queue.poll(); 
            for(int i = 0 ; i < 4; i++){
                int wx = dx[i] + temp[0];
                int wy = dy[i] + temp[1];
                if(wx < 0 || wy < 0 || wx >= n || wy >= m || visit[wx][wy] || maps[wx][wy] == 0){
                    continue;
                }
                
                if(wx == n-1 && wy == m-1){
                    return temp[2]+1;
                }
                else{
                    visit[wx][wy] = true;
                    queue.offer(new int[]{wx,wy,temp[2]+1});
                }
            }
        }
        
        
        return -1;
    }
}