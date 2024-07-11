import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int[] dX = {-1,1,0,0};
    static int[] dY = {0,0,-1,1};
    static int[][] board;
    static boolean[][] visit;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        board = new int[n][n];
        Queue<int[]> queue = new LinkedList<>();
        int k = 0;
        for(int i = 0 ; i < n ; i++){
            int j = 0;
            for(String s : br.readLine().split(" ")) {
                k = Math.max(k , Integer.parseInt(s));
                board[i][j++] = Integer.parseInt(s);
            }
        }

        int count = 0;
        for(int l = 0 ; l <= k ; l++) {
            int temp = 0;
            visit = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visit[i][j] && board[i][j] >= l) {
                        visit[i][j] = true;
                        queue.offer(new int[]{i, j});
                        bfs(queue, l);
                        temp++;
                    }
                }
            }
            count = Math.max(count , temp);
        }
        System.out.println(count);
    }

    public static void bfs(Queue<int[]> queue, int high){
        while(!queue.isEmpty()){
            int[] temp = queue.poll();

            for(int i = 0 ; i < 4; i++){
                int nX = temp[1] + dX[i];
                int nY = temp[0] + dY[i];

                if(nX < 0 || nY < 0 || nX >= n || nY >=n) continue;

                if(board[nY][nX] >= high && !visit[nY][nX]) {
                    visit[nY][nX] = true;
                    queue.offer(new int[]{nY,nX});
                }
            }
        }
    }
}
