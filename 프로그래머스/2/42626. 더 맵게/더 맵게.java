import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int i : scoville){
            queue.offer(i);
        }
        
        while(queue.peek() < K){
            int f = queue.poll();
            if(queue.isEmpty()){
                answer = -1;
                break;
            }
            queue.offer(f+(queue.poll() * 2));
            answer++;
        }
        
        return answer;
    }
}