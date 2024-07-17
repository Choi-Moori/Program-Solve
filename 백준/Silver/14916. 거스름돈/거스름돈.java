import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];

        for(int i = 2; i < n+1 ; i++){
            if(i%2 == 0)
                dp[i] = i/2;
            if(i%5 == 0)
                dp[i] = i/5;
        }
        dp[1] = -1;
        if(n > 2)
            dp[3] = -1;
        for(int i = 5 ; i < n+1; i++){
            if(dp[i-2] == 0 || dp[i-2] == -1)
                dp[i] = dp[i-5]+1;
            else if(dp[i-5] == 0 || dp[i-5] == -1)
                dp[i] = dp[i-2]+1;
            else if(dp[i-2] == 0 && dp[i-5] == 0)
                dp[i] = -1;
            else
                dp[i] = Math.min(dp[i-5]+1, dp[i - 2]+1);
        }
        System.out.println(dp[n]);
    }
}
