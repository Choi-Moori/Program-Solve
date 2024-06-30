import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visitdfs;
    static boolean[] visitbfs;
    static List<List<Integer>> list;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");
        list = new ArrayList<>();
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        int target = Integer.parseInt(st[2]);
        visitdfs = new boolean[n+1];
        visitbfs = new boolean[n+1];

        for(int i = 0; i <= n ; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 1 ; i <= m ; i++){
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            list.get(a).add(b);
            list.get(b).add(a);
        }

        for(int i = 1 ; i <= n ; i++){
            Collections.sort(list.get(i));
        }

        dfs(target);
        sb.append("\n");
        bfs(target);
        System.out.println(sb);
    }

    public static void dfs(int start){
        sb.append(start).append(" ");
        visitdfs[start] = true;
        for(int i : list.get(start)){
            if(!visitdfs[i])
                dfs(i);
        }
    }
    public static void bfs(int start){
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(list.get(start));
        while(!queue.isEmpty()){
            List<Integer> temp =queue.poll();
            visitbfs[start] = true;
            for(int i : temp){
                if(!visitbfs[i]) {
                    queue.add(list.get(i));
                    sb.append(start).append(" ");
                    start = i;
                    visitbfs[i] = true;
                }
            }
        }
        sb.append(start);
    }
}