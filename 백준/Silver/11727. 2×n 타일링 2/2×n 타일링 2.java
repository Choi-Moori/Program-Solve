import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] dp = new int[num];

        if(num < 2){
            System.out.println(1);
        }
        else if(num == 2)
            System.out.println(3);
        else{
            dp[0] = 1;
            dp[1] = 3;
            for(int i = 2 ; i < num ; i ++){
                dp[i] = (dp[i-2]*2 + dp[i-1])%10007;
            }
            System.out.println(dp[num-1]);
        }

    }
}
