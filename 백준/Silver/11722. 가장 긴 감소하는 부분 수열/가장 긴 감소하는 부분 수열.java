import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int i = 0;

        for(String s : br.readLine().split(" ")){
            num[i++] = Integer.parseInt(s);
        }

        for(i = 1 ; i < n ; i++){
            for(int j = 0 ; j <i; j++){
                if(num[i] < num[j])
                    dp[i] = Math.max(dp[i] , dp[j]+1);
            }
        }
        int res = 0;
        for(int k : dp){
            res = Math.max(res, k);
        }
        System.out.println(res);
    }
}
