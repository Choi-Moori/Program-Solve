import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int n;
    static int m;

    static boolean[][] visit;
    static int[][] board;
    static int[] dX = {-1,1,0,0};
    static int[] dY = {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        n = Integer.parseInt(NM[0]);
        m = Integer.parseInt(NM[1]);
        visit = new boolean[n][m];
        board = new int[n][m];

        for(int i = 0 ; i < n ; i++){
            int j = 0;
            for(String s : br.readLine().split(""))
                board[i][j++] = Integer.parseInt(s);
        }
        bfs(0,0);
    }
    public static void bfs(int row, int col){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        visit[row][col] = true;

        while(!queue.isEmpty()){
            int[] temp = queue.poll();

            for(int i = 0 ; i < 4; i++){
                int tX = temp[1] + dX[i];
                int tY = temp[0] + dY[i];

                if(tX < 0 || tX >= m || tY < 0 || tY >=n)
                    continue;
                if(board[tY][tX] != 1 || visit[tY][tX])
                    continue;

                queue.offer(new int[]{tY,tX});
                board[tY][tX] = board[temp[0]][temp[1]] + 1;
            }
        }
        System.out.println(board[n-1][m-1]);
    }
}
