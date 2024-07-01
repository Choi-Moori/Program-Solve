import java.io.*;
import java.util.*;

public class Main {
    static int[][] board;
    static Queue<int[]> queue = new LinkedList<>();
    static boolean[][] visit;
    static int n,m;

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");

        n = Integer.parseInt(st[1]);
        m = Integer.parseInt(st[0]);

        board = new int[n][m];
        visit = new boolean[n][m];

        for(int i = 0 ; i < n ; i++){
            int j = 0;
            for(String s : br.readLine().split(" ")) {
                if(s.equals("1"))
                    queue.offer(new int[]{i,j});
                board[i][j++] = Integer.parseInt(s);
            }
        }
        bfs();
        int max = 0;
        for(int i = 0 ; i < n ; i++){
            int j = 0;
            for(int k : board[i]) {
                if (k == 0) {
                    max = 0;
                    i = n;
                    break;
                }
                max = Math.max(max , k);
            }
        }
        System.out.println(max-1);
    }

    public static void bfs(){
        while (!queue.isEmpty()){
            int[] temp = queue.poll();
            visit[temp[0]][temp[1]] = true;

            for(int i = 0 ; i < 4;i++){
                int nX = temp[1] + dx[i];
                int nY = temp[0] + dy[i];

                if(nX < 0 || nY < 0 || nX >= m || nY >= n || board[nY][nX] == -1)
                    continue;
                if(board[nY][nX] != 0) continue;

                if(board[nY][nX] == 0)
                    board[nY][nX] = board[temp[0]][temp[1]] + 1;

                queue.offer(new int[]{nY, nX});
            }
        }
    }
}
