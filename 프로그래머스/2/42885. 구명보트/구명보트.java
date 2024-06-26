import java.util.*;
class Solution {
    public static int solution(int[] people, int limit){
        int count = 0;
        Deque<Integer> queue = new ArrayDeque<>();
        Arrays.sort(people);
        for(int i : people) queue.add(i);

        while(!queue.isEmpty()){
            int last = queue.pollLast();
            count++;
            if(!queue.isEmpty() &&  last + queue.peekFirst() <= limit){
                queue.pollFirst();
            }
        }
        return count;
    }
}