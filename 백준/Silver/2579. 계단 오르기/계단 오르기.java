import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n+1];
        int[] dp = new int[n+1];

        for(int i = 1 ; i < n+1 ; i++){
            num[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = num[1];
        if(n>=2) {
            dp[2] = num[2]+num[1];
        }
        for(int i = 3 ; i < n+1 ; i++) {
            dp[i] = Math.max(dp[i-2],dp[i-3]+num[i-1])+num[i];
        }
        System.out.println(dp[n]);
    }
}
