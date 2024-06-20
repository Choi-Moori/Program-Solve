import java.io.*;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        int[] dp = new int[n];
        int i = 0;

        for(String st : br.readLine().split(" ")) {
            num[i] = Integer.parseInt(st);
            dp[i++] = 1;
        }

        for(i = 1; i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                if(num[i] > num[j]){
                    dp[i] = Math.max(dp[j]+1 , dp[i]);
                }
            }
        }
        int res = 0;
        for(int k : dp)
            res = Math.max(res,k);

        System.out.println(res);
    }
}
