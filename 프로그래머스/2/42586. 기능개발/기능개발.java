import java.util.*;

class Solution {
    public Object[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> deq = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        for (int i=0; i<progresses.length; i++) {
            int temp = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0 )
                temp += 1;
            deq.offer(temp);
        }

        int day = 0;
        while(!deq.isEmpty()) {
            day = deq.pollFirst();
            int count = 1;
            while (!deq.isEmpty() && day >= deq.peekFirst()) {
                deq.pollFirst();
                count++;
                if (deq.isEmpty()) {
                    break;
                }
            }
            result.add(count);
        }

        return result.toArray();
    }
}