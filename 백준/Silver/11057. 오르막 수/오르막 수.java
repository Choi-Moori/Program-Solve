import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] dp = new long[n][10];
        long dpnum = 1;
        for(int i = 0 ; i < 10 ; i++){
            dp[0][i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 9; j >= 0; j--) {
                if(j == 9){
                    dp[i][j] = 1;
                }
                else if(j == 0){
                    dpnum += dp[i][j+1];
                    dp[i][j] = dpnum;
                }
                else{
                    dp[i][j] = (dp[i][j+1] + dp[i-1][j])%10007;
                }
            }
        }
        long result = 0;
        for(long i : dp[n-1])
            result += i;
        System.out.println(result%10007);
    }
}

//if (j == 0) dp[i][j] = dpnum;
//                else if (j == 9) {
//dp[i][j] = 1;
//dpnum++;
//        } else {
//dp[i][j] = (dp[i][j - 1] - dp[i - 1][j - 1]) % 10007;
//dpnum += dp[i][j];
//        }