import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n,m;
    static char[][] board;
    static Queue<int[]> first;
    static Queue<int[]> queue;
    static int[] dochi = new int[2];

    static boolean wd;
    static int[] dX = {-1,1,0,0};
    static int[] dY = {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");

        n = Integer.parseInt(st[0]);
        m = Integer.parseInt(st[1]);
        board = new char[n][m];
        queue = new LinkedList<>();
        first = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o2[2],o1[2]);
            }
        });

        for(int i = 0 ; i < n ; i++){
            String line = br.readLine();
            for(int j = 0 ; j  < m ; j++){
                board[i][j] = line.charAt(j);
                if(board[i][j] == 'S'){
                    first.offer(new int[]{i,j,0});
                }
                else if(board[i][j] == '*'){
                    first.offer(new int[]{i,j,-1});
                }
                else if(board[i][j] == 'D'){
                    dochi[0] = i;
                    dochi[1] = j;
                }

            }
        }

        while(!first.isEmpty()) {
            queue.offer(first.poll());
        }
        int result = bfs();
        if(result == -1)
            System.out.println("KAKTUS");
        else
            System.out.println(result);

    }

    public static int bfs() {
        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            int Y = temp[0];
            int X = temp[1];
            int deri = temp[2];

            for(int i = 0 ; i < 4 ; i++) {
                int nX = X + dX[i];
                int nY = Y + dY[i];

                if (nX < 0 || nY < 0 || nX >= m || nY >= n) continue;
                if (deri != -1 && board[Y][X] == '*') continue;

                if (deri == -1) {
                    if (board[nY][nX] == '.' || board[nY][nX] == 'S') {
                        board[nY][nX] = '*';
                        queue.add(new int[]{nY, nX, -1});
                    }
                } else {
                    if (board[nY][nX] == 'D')
                        return deri+1;
                    if (board[nY][nX] == '.') {
                        board[nY][nX] = 'S';
                        queue.add(new int[]{nY, nX, deri+1});
                    }
                }
            }
        }
        return -1;
    }
}