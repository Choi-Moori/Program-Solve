import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        visit = new boolean[100001];
        System.out.println(bfs(n, k));
    }
    public static int bfs(int n, int k){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{n, 0});

        while(!queue.isEmpty()){
            int[] temp = queue.poll();

            if(temp[0] == k){
                return temp[1];
            }

            if(temp[0] *2 <= 100000 && !visit[temp[0]*2]) {
                queue.offer(new int[]{temp[0] * 2, temp[1] + 1});
                visit[temp[0]*2] = true;
            }
            if(temp[0] -1 >= 0 &&!visit[temp[0]-1]) {
                queue.offer(new int[]{temp[0] - 1, temp[1] + 1});
                visit[temp[0]-1] = true;
            }
            if(temp[0] +1 <= 100000 &&!visit[temp[0]+1]) {
                queue.offer(new int[]{temp[0] + 1, temp[1] + 1});
                visit[temp[0]+1] = true;
            }
        }
        return 0;
    }
}
