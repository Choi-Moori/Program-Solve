import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int s : scoville) {
            minHeap.add(s);
        }
        
        while(minHeap.size() > 1 && minHeap.peek() < K) {
            int leastSpicy = minHeap.poll();
            int secondLeastSpicy = minHeap.poll();
            int newDish = leastSpicy + (secondLeastSpicy * 2);
            minHeap.add(newDish);
            answer++;
        }
        
        if(minHeap.peek() < K) {
            return -1; // 더 이상 섞을 수 없을 때 목표 K를 달성하지 못하는 경우
        }
        
        return answer;
    }
}