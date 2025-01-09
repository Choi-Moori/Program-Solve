import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int end = 0;
        int count = 0;
        int index = 0;
        
        Arrays.sort(jobs, (o1,o2) -> o1[0]-o2[0]);
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        while(count < jobs.length){
            while(index < jobs.length && jobs[index][0] <= end){
                pq.offer(jobs[index++]);
            }
            if(pq.isEmpty()){
                end = jobs[index][0];
            }
            else{
                int[] temp = pq.poll();
                answer += temp[1] + end - temp[0];
                count++;
                end += temp[1];
            }
        }
        return answer/count;
    }
}