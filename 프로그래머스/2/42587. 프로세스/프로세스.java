import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int size = priorities.length;
        int count = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : priorities){
            pq.offer(i);
        }
        Queue<int[]> queue = new LinkedList<>();
        
        for(int i = 0 ; i < size; i++){
            queue.offer(new int[]{priorities[i], i});
        }

        while(!queue.isEmpty()){
            int max = pq.poll();
            int[] temp = queue.poll();
            while(!(max == temp[0])){
                queue.offer(temp);
                temp = queue.poll();
            }
            count++;
            if(temp[1] == location){
                answer = count;
                break;
            }
        }
        
        return answer;
    }
}