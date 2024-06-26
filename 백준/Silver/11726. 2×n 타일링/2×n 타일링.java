import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] dp = new int[num+1];

        if(num < 2){
            System.out.println(1);
        }
        else{
            dp[0] = 1;
            dp[1] = 1;
            for(int i = 2; i < num+1; i++){
                dp[i] = dp[i-1]%10007 + dp[i-2]%10007;
            }
            System.out.println(dp[num]%10007);
        }


    }
}
