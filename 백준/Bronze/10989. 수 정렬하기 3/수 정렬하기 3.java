import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] pq = new int[10001];
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < n ; i++){
            pq[Integer.parseInt(br.readLine())]++;
        }

        for(int i = 0 ; i < pq.length; i++){
            if(pq[i] != 0){
                while(pq[i] --> 0){
                    sb.append(i).append("\n");
                }
            }
        }
        System.out.println(sb);

    }
}
