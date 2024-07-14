import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        int[] res = new int[3];
        res[0] = Integer.MAX_VALUE;
        int i = 0;
        for(String s : br.readLine().split(" "))
            num[i++] = Integer.parseInt(s);

        Arrays.sort(num);

        int left = 0;
        int right = num.length-1;

        while(left < right){
            int sum = num[left]+num[right];
            if(Math.abs(res[0]) > Math.abs(sum)){
                res[0] = sum;
                res[1] = num[left];
                res[2] = num[right];
            }
            if(sum==0){
                break;
            }
            else if(sum > 0)
                right--;
            else
                left++;
        }
        System.out.println(res[1] + " " + res[2]);
    }
}
