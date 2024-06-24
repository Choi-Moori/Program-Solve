import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        List<Integer> pq = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            pq.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(pq);

        for(int i : pq)
            sb.append(i).append("\n");
        System.out.println(sb);
    }
}
