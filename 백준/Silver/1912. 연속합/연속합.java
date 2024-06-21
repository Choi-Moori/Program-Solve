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
        int i = 0;
        for(String s : br.readLine().split(" "))
            num[i++] = Integer.parseInt(s);
        dp[0] = num[0];
        for(i = 1 ; i < n ; i++){
            dp[i] = Math.max(num[i]+dp[i-1], num[i]);
        }

        int res = -1001;
        for(int j : dp){
            res = Math.max(j,res);
        }
        System.out.println(res);

    }
}
