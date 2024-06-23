import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        int[] leftdp = new int[n];
        int[] rightdp = new int[n];
        Arrays.fill(leftdp, 1);
        Arrays.fill(rightdp, 1);
        int i = 0;

        for(String s : br.readLine().split(" "))
            num[i++] = Integer.parseInt(s);

        for(i = 1 ; i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                if(num[i] > num[j]){
                    leftdp[i] = Math.max(leftdp[i], leftdp[j]+1);
                }
            }
        }
        for(i = n-2 ; i >=0 ; i--){
            for(int j = n-1 ; j > i ; j--){
                if(num[i] > num[j]){
                    rightdp[i] = Math.max(rightdp[i], rightdp[j]+1);
                }
            }
        }
        i = 0;
        int result = 0;
        for(int j : rightdp)
            result = Math.max(result, j+leftdp[i++] -1);

        System.out.println(result);
    }
}
