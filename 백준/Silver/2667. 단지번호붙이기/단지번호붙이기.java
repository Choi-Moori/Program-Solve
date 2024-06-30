import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[][] visit;
    static int[][] board;
    static int[] res;

    static int[] dX = {-1,1,0,0};
    static int[] dY = {0,0,-1,1};
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        board = new int[n][n];
        visit = new boolean[n][n];

        for(int i = 0 ; i < n; i++){
            int j = 0;
            for(String s : br.readLine().split(""))
                board[i][j++] = Integer.parseInt(s);
        }
        int count = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j<n;j++){
                if(!visit[i][j] && board[i][j] == 1){
                    count++;
                    bfs(i,j, count);
                }
            }
        }
        res = new int[count];

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j++){
                if(board[i][j] != 0)
                    res[board[i][j]-1] += 1;
            }
        }

        Arrays.sort(res);
        sb.append(count).append("\n");
        for(int i : res){
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
    public static void bfs(int row, int col, int cnt){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{row,col});
        visit[row][col] = true;
        board[row][col] = cnt;

        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            for(int i = 0 ; i < 4 ; i++){
                int tX = temp[1] + dX[i];
                int tY = temp[0] + dY[i];

                if(tX < 0 || tY < 0 || tX >= n || tY >= n)
                    continue;

                if(board[tY][tX] != 1 || visit[tY][tX])
                    continue;

                queue.offer(new int[]{tY,tX});
                visit[tY][tX] = true;
                board[tY][tX] = cnt;
            }
        }
    }
}
