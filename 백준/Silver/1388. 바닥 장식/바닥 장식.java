import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String[][] res;
    static boolean[][] visit;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[2];
        int i = 0 ;
        for(String s : br.readLine().split(" ")){
            num[i++] = Integer.parseInt(s);
        }

        res = new String[num[0]][num[1]];
        visit = new boolean[num[0]][num[1]];

        for(i = 0 ; i < num[0] ; i++){
            int j = 0;
            for(String s : br.readLine().split(""))
                res[i][j++] = s;
        }
        String before = "";
        for (int j = 0; j < res.length; j++) {
            for (i = 0; i < res[j].length; i++) {
                if (res[j][i].equals("-")) {
                    visit[j][i] = true;
                    if (i!=res[j].length-1) {
                        if (!res[j][i].equals(res[j][i + 1])) {
                            count++;
                        }
                    }
                    else {
                        if (res[j][i].equals("-")) count++;
                    }
                }
            }
        }
        for(i = 0 ; i < res.length ; i++){
            for(int j = 0 ; j < res[i].length ; j++){
                if(!visit[i][j]){
                    if(i != res.length-1) {
                        dfs(j, i + 1);
                        count++;
                        visit[i][j] = true;
                    }
                    else{
                        count++;
                        visit[i][j] = true;
                    }
                }
            }
        }
        System.out.println(count);
    }
    static void dfs(int col, int row){
        if(row >= res.length || visit[row][col]){
            return;
        }
        visit[row][col] = true;
        dfs(col, row + 1);
    }

}
