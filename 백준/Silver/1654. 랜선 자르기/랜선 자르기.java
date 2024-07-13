import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int k;
    static int n;
    static int[] num;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        k = Integer.parseInt(s[0]);
        n = Integer.parseInt(s[1]);
        num = new int[k];
        int max = 0;

        for(int i = 0 ; i < k ; i++){
            num[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, num[i]);
        }

        if(n != 1)
            binary_search(max, n);
        else{
            System.out.println(num[0]);
        }
    }
    public static void binary_search(long end, int tag){
        long start = 1;
        long res = 0;

        while(start <= end){
            long mid = (start + end)/2;
            int count = 0;

            for(int i = 0 ; i < k ; i++){
                count += num[i]/mid;
            }

            if(count >= tag){
                res = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }

        }
        System.out.println(res);
    }
}
