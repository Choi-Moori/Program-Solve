import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] num;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        num = new int[n];
        int i = 0;
        int max = 0;
        for(String s : br.readLine().split(" ")) {
            max = Math.max(max , Integer.parseInt(s));
            num[i++] = Integer.parseInt(s);
        }

        binary_search(m, max);
    }


    public static void binary_search(int tag, int end){
        int start = 0;
        int mid = 0;
        int res = 0;
        while(start <= end){
            long count = 0;
            mid = (start+end)/2;
            for(int i : num){
                if(i > mid){
                    count+= i-mid;
                }
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
