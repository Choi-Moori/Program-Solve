import java.util.*;

class Solution {
    public static int[] dx = {-1, 1 , 0 , 0};
    public static int[] dy = {0, 0 , -1 , 1};
    public static boolean[][] visit;
    public static int n;
    public static int m;
    Map<Integer, Integer> oilSize = new HashMap<>();
    int groupId = 1;
    
    public int solution(int[][] land) {
        n = land.length;
        m = land[0].length;
        visit = new boolean[n][m];
        int[][] group = new int[n][m];
        
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m ; j++){
                if(!visit[i][j] && land[i][j] == 1){
                    int size = bfs(land, group,i, j, groupId);
                    oilSize.put(groupId, size);
                    groupId++;
                }
            }
        }
        
        int max = 0;
        for(int i = 0; i < m ; i++){
            boolean[] count = new boolean[oilSize.size()];
            int temp = 0;
            for(int j = 0 ; j < n ; j++){
                if(land[j][i] == 1 && !count[group[j][i]-1]){
                    count[group[j][i]-1] = true;
                    int id = group[j][i];
                    temp += oilSize.get(id);
                }
            }
            max = Math.max(max, temp);
        }
        return max;
    }
    
    private int bfs(int[][] land, int[][] group, int x, int y, int id){
        int cnt = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        visit[x][y] = true;
        group[x][y] = id;
        
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            for(int i = 0 ; i < 4; i++){
                int nx = now[0] - dx[i];
                int ny = now[1] - dy[i];
                
                if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                    if(!visit[nx][ny] && land[nx][ny] == 1){
                        visit[nx][ny] = true;
                        cnt++;
                        group[nx][ny] = id;
                        queue.offer(new int[]{nx, ny});
                    }
                }

            } 
        }
        return cnt;
    }
}