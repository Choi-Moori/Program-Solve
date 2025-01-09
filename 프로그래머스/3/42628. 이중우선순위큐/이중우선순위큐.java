import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {};
        Deque<Integer> deque = new ArrayDeque<>();
        for(String s : operations){
            String[] temp = s.split(" ");
            
            if(temp[0].equals("I")){
                deque.offer(Integer.parseInt(temp[1]));
            }
            else if(temp[0].equals("D") && !deque.isEmpty()){
                List<Integer> list = new ArrayList<>(deque);
                Collections.sort(list);
                deque = new ArrayDeque<>(list);
                int num = Integer.parseInt(temp[1]);
                if(num > 0)
                    deque.pollLast();
                else
                    deque.pollFirst();
            }
        }
        List<Integer> list = new ArrayList<>(deque);
        Collections.sort(list);
        deque = new ArrayDeque<>(list);
        if(deque.isEmpty()){
            answer = new int[]{0,0};
        }
        else{
            answer = new int[]{deque.getLast(), deque.getFirst()};
        }
        return answer;
    }
}