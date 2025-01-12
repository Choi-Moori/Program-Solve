import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : works){
            queue.offer(i);
        }
        
        for(int i = 0 ; i < n ; i++){
            queue.offer(queue.poll()-1);
        }
        
        while(!queue.isEmpty()){
            int i = queue.poll();
            if(i >= 0){
                answer = answer + (i*i);
            }
        }
        
        return answer;
    }
}