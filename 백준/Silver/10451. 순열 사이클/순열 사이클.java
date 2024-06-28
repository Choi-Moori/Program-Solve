import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static boolean[] visit;
    static int count;
    static List<List<Integer>> list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        while(tc --> 0){
            count = 0;
            list = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());
            int[][] num =  new int[2][n];
            int j = 0;
            visit = new boolean[n+1];
            for(String s : br.readLine().split(" ")){
                num[0][j] = j+1;
                num[1][j++] = Integer.parseInt(s);
            }
            for(int i = 0 ; i < n+1 ; i++){
                list.add(new ArrayList<>());
            }
            for(int i = 0 ; i < n ; i++){
                if(!(num[0][i] == num[1][i]))
                    list.get(num[0][i]).add(num[1][i]);
            }

            for(int i = 1 ; i < list.size() ; i++)
                if(!visit[i])
                    dfs(i);
            System.out.println(count);
        }
    }

    public static void dfs(int start){
        if(visit[start]){
            count++;
            return;
        }
        if(!visit[start] && list.get(start).isEmpty()){
            count++;
            return;
        }
        visit[start] = true;
        for(int i = 0 ; i < list.get(start).size(); i++)
            dfs(list.get(start).get(i));
    }
}
