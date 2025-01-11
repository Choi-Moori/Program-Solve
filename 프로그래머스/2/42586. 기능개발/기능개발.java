import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0 ; i < speeds.length; i++){
            queue.offer((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }
        
        int count = 1;
        int temp = queue.poll();
        while(!queue.isEmpty()){
            if(!queue.isEmpty() && temp >= queue.peek()){
                count++;
                queue.poll();
            }
            else{
                list.add(count);
                count = 1;
                temp = queue.poll();
            }
        }
        list.add(count);
        
        int[] answer = new int[list.size()];
        
        for(int i = 0 ; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}