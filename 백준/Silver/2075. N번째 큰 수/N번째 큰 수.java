import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = sc.nextInt();
        int temp = 0;
        for(int j = 0 ; j < num*num ; j++){
                temp = sc.nextInt();
                if(pq.size() != num)
                    pq.add(temp);
                else{
                    if(pq.peek() < temp){
                        pq.poll();
                        pq.add(temp);
                    }
                }

        }
        System.out.println(pq.peek());
    }
}
