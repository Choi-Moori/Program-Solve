import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new PriorityQueue<>();

        int count = 0;

        for(int i = 0 ; i < N ; i++){
            queue.offer(Integer.parseInt(br.readLine()));
        }

        if(N == 1){
            System.out.println(0);
        }
        else{
            while(!queue.isEmpty()){
                int a = queue.poll();
                if(!queue.isEmpty() && queue.peek() >= a){
                    int temp = a + queue.poll();
                    count += temp;
                    queue.add(temp);
                }
            }
            System.out.println(count);
        }
    }
}
