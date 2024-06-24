import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        String n = br.readLine();
        for(String s : n.split("")){
            pq.add(Integer.parseInt(s));
        }

        while(!pq.isEmpty())
            sb.append(pq.poll());

        System.out.println(sb);
    }
}
