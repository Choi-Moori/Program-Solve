import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] n = new int[2];
        int i = 0;
        for(String s : br.readLine().split(" ")){
            n[i++] = Integer.parseInt(s);
        }

        long[][] dp = new long[n[1]][n[0]];
        Arrays.fill(dp[0], 1);
        for(i = 0;i<n[1];i++) {
            dp[i][0] = i+1;
        }

        for(i = 1 ; i < n[1] ; i++){
            for(int j = 1; j < n[0] ; j++){
                dp[i][j] = (dp[i-1][j]+dp[i][j-1])%1000000000;
            }
        }

        System.out.println(dp[n[1]-1][n[0]-1]);
    }
}
