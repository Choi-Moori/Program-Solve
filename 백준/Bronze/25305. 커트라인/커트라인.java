import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int k = Integer.parseInt(st[1]);

        for(String s : br.readLine().split(" ")){
            queue.offer(Integer.parseInt(s));
        }
        k -= 1;
        while( k --> 0)
            queue.poll();

        System.out.println(queue.poll());
    }
}
