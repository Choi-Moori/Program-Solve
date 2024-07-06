import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static boolean[][] visit;
    static int[][] num;

    static int[] dX = {-1,1,0,0};
    static int[] dY = {0,0,-1,1};
    static int m;
    static int n;
    static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test_case = Integer.parseInt(br.readLine());
        while(test_case --> 0){
            int count = 0;
            String[] st = br.readLine().split(" ");
            m = Integer.parseInt(st[0]);
            n = Integer.parseInt(st[1]);
            k = Integer.parseInt(st[2]);

            num = new int[m][n];
            visit = new boolean[m][n];
            Queue<int[]> queue = new LinkedList<>();

            for(int i = 0 ; i < k ; i++){
                String[] loca = br.readLine().split(" ");
                int row = Integer.parseInt(loca[0]);
                int col = Integer.parseInt(loca[1]);
                num[row][col] = 1;
            }

            for(int i = 0 ; i < m ; i++){
                for(int j = 0 ; j < n ; j++){
                    if(num[i][j] == 1 && !visit[i][j]){
                        queue.offer(new int[]{i,j});
                        visit[i][j] = true;
                        bfs(queue);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void bfs(Queue<int[]> queue){
        while(!queue.isEmpty()){
            int[] temp = queue.poll();

            for(int i = 0 ; i < 4 ; i++){
                int nX = temp[1]+dX[i];
                int nY = temp[0]+dY[i];

                if(nX < 0 || nY < 0 || nX >= n || nY >=m) continue;

                if(num[nY][nX] != 0 && !visit[nY][nX]){
                    queue.offer(new int[]{nY,nX});
                    visit[nY][nX] = true;
                }
            }
        }
    }
}
