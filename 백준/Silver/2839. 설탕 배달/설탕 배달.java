import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] dp = new int[num+1];
        for(int i = 3 ; i <= num ; i++){
            if(i % 3 == 0) dp[i] = i/3;
            if(i % 5 == 0) dp[i] = i/5;

            if(i - 3 >= 0 && i - 5 >= 0){
                if(dp[i] == 0) {
                    if((i-5)%3 == 0 || (i-3)%5 == 0 || dp[i-5] !=0 || dp[i-3] != 0)
                        dp[i] = Math.min(dp[i - 3] + 1, dp[i - 5] + 1);
                }
                else {
                    dp[i] = Math.min(dp[i] , dp[i-3]==0? dp[i] : dp[i-3]+1);
                    dp[i] = Math.min(dp[i] , dp[i-5]==0? dp[i] : dp[i-5]+1);
                }
            }
        }
        if(dp[num] == 0)
            System.out.println(-1);
        else
            System.out.println(dp[num]);
    }
}
