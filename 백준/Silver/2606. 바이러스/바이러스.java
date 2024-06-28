import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static int count = 0;
    static boolean[] visit;
    static List<List<Integer>> list ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        list = new ArrayList<>();
        int CN = Integer.parseInt(br.readLine());
        int NN = Integer.parseInt(br.readLine());
        visit = new boolean[CN+1];

        for(int i = 0 ; i < CN+1 ; i++){
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < NN; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            list.get(a).add(b);
            list.get(b).add(a); // 양방향 연결 추가
        }

        dfs(1);
        System.out.println(count-1);
    }

    public static void dfs(int start){
        if (visit[start]) {
            return;
        }

        visit[start] = true;
        count++;

        for (int i : list.get(start)) {
            if (!visit[i]) {
                dfs(i);
            }
        }
    }
}
