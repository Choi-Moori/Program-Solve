import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[][] dp = new long[n][10];
        for (int i = 0; i < 10; ) {
            dp[0][i++] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0)
                    dp[i][j] = dp[i - 1][j + 1] % 1000000000;
                else if (j == 9)
                    dp[i][j] = dp[i - 1][j - 1] % 1000000000;
                else
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
            }
        }
        long res = 0;
        for (int i = 0; i < 10; i++) {
            res += dp[n - 1][i];
        }
        System.out.println((res - dp[n - 1][0]) % 1000000000);

    }
}
