import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = 0;

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        String[] st = new String[n];
        int target = 0;
        for(int i = 0 ; i < n ; i++){
            st[i] = br.readLine();
            if(i == 0){
                target = Integer.parseInt(st[i]);
            }
            else{
                queue.offer(Integer.parseInt(st[i]));
            }
        }

        if(n == 1){
            System.out.println(count);
        }
        else{
            while(queue.peek() >= target){
                queue.offer(queue.poll()-1);
                target++;
                count++;
            }
            System.out.println(count);
        }

    }
}
