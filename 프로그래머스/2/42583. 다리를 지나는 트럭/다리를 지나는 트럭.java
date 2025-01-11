import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int temp = 0;
        int index = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < bridge_length ; i++){
            queue.offer(0);
        }
        
        while(!queue.isEmpty()){
            answer++;
            
            temp-= queue.poll();
            if(index < truck_weights.length){
                if(temp+truck_weights[index] <= weight){
                    queue.offer(truck_weights[index]);
                    temp += truck_weights[index];
                    index++;
                }else{
                    queue.offer(0);
                }
            }
        }
        
        return answer;
    }
}