import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] nlist;
    static int[] mlist;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        nlist = new int[n];
        for(int i = 0 ; i < n ; i++){
            nlist[i] = Integer.parseInt(st[i]);
        }

        int m = Integer.parseInt(br.readLine());
        st = br.readLine().split(" ");
        mlist = new int[m];
        for(int i = 0 ; i < m ; i++){
            mlist[i] = Integer.parseInt(st[i]);
        }
        Arrays.sort(nlist);

        for(int i : mlist) {
            if (binary_search(i,0, n - 1)) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static boolean binary_search(int target, int start , int end){
        while(start <= end){
            int mid = (start+end)/2;

            if(target == nlist[mid]){
                return true;
            }
            else if(target > nlist[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
}
