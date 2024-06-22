import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        int[] dp = new int[n];

        for(int i = 0 ; i < n ; i++){
            num[i] = Integer.parseInt(br.readLine());
        }

        if(n == 1){
            System.out.println(num[0]);
        }
        else if(n==2){
            System.out.println(num[0]+num[1]);
        }
        else{
            dp[0] = num[0];
            dp[1] = num[0]+num[1];
            dp[2] = Math.max(num[2]+num[1], num[0]+num[2]);
            for(int i = 3 ; i < n ; i++){
                dp[i] = Math.max(dp[i-3]+num[i-1]+num[i], num[i]+dp[i-2]);
            }
           System.out.println(dp[n-1]);
        }

    }
}
