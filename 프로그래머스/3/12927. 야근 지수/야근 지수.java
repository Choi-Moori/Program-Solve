import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : works){
            pq.add(i);
        }

        while(n --> 0){
            pq.add(pq.poll()-1);
        }
        long result = 0;

        for(int i : pq) {
            if (i < 0)
                i = 0;
            result += i*i;
        }
        return result;
    }
}