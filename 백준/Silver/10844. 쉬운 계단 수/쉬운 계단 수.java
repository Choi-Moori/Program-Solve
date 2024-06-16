import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[][] dp = new long[n][10];
        if(n == 0)
            System.out.println(0);
        else {
            for (int i = 0; i < 10; i++) {
                dp[0][i] = 1;
            }
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < 10; j++) {
                    if (j == 0) {
                        dp[i][j] = dp[i - 1][j + 1] % 1000000000;
                    } else if (j == 9) {
                        dp[i][j] = dp[i - 1][j - 1] % 1000000000;
                    } else {
                        dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
                    }
                }
            }
            long total = 0;
            for (long i : dp[n - 1]) {
                total += i;
            }
            total -= dp[n - 1][0];

            System.out.println(total%1000000000);
        }
    }
}
