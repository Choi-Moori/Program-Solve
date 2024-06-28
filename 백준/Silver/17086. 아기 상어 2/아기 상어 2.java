import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main   {
    static int[][] num;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        List<int[]> sharklocation = new ArrayList<>();

        num = new int[n][m];
        for(int i = 0 ; i < num.length; i++){
            int j = 0;
            for(String s : br.readLine().split(" ")) {
                if(s.equals("1")) {
                    s = "-1";
                    sharklocation.add(new int[]{i, j});
                }
                num[i][j++] = Integer.parseInt(s);
            }
        }
        sharklocation.sort((a,b) ->{
            if(a[0] > b[0]){
                return b[0];
            }
            return a[0];
        });

        int max = -1;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(num[i][j] == 0){
                    num[i][j] = Math.max(n-1,m-1);
                    for(int[] k: sharklocation){
                        num[i][j] = Math.min(num[i][j], Math.max(Math.abs(i- k[0]),Math.abs(j-k[1])));
                    }
                    max = Math.max(num[i][j],max);
                }
            }
        }
        System.out.println(max);

    }
}
