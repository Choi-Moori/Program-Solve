import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] numlist = new int[num];
        int[] dp = new int[num];
        for(int i = 0 ; i < num ; i++)
            numlist[i] = Integer.parseInt(br.readLine());

        if(num < 2)
            System.out.println(numlist[0]);
        else if(num < 3)
            System.out.println(numlist[0] + numlist[1]);
        else {
            dp[0] = numlist[0];
            dp[1] = Math.max(dp[0], dp[0] + numlist[1]);
            dp[2] = Math.max(dp[0] + numlist[2], numlist[1] + numlist[2]);
            dp[2] = Math.max(dp[2], dp[1]);
            for (int i = 3; i < num; i++) {
                dp[i] = Math.max(numlist[i - 1] + numlist[i] + dp[i - 3], dp[i - 2] + numlist[i]);
                dp[i] = Math.max(dp[i], dp[i - 1]);
            }

            System.out.println(dp[num-1]);
        }
    }
}
