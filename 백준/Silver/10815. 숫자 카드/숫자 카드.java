import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] card = new int[n];
        String[] st = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        int[] numlist = new int[m];
        for(int i = 0 ; i < n ; i++){
            card[i] = Integer.parseInt(st[i]);
        }
        st = br.readLine().split(" ");
        for(int i = 0 ; i < m ; i++){
            numlist[i] = Integer.parseInt(st[i]);
        }

        Arrays.sort(card);
        for(int i = 0 ; i < m ; i++){
            if(bin_src(card, numlist[i], 0, n-1)){
                System.out.print(1 + " ");
            }
            else {
                System.out.print(0 + " ");
            }
        }
    }

    public static boolean bin_src(int[] card,int tar, int start, int end){
        while(start <= end){
            int mid = (start + end)/2;
            if(card[mid] == tar){
                return true;
            }
            else if(card[mid] < tar){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
}
