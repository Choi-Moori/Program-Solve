import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> myMap = new HashMap<>();
        Map<String, Integer> myMap2 = new HashMap<>();
        
        for(String i : completion)
            myMap.put(i, myMap.containsKey(i) ? myMap.get(i) + 1 : 1);
        
        for(String i : participant){
            myMap2.put(i, myMap2.containsKey(i) ? myMap2.get(i) + 1 : 1);
        }
        
        for(String i : participant){
            if(myMap.get(i) == null){
                answer = i;
                break;
            }
            int num = myMap2.get(i) - myMap.get(i);
            if (num > 0) answer =i;
        }
        return answer;
    }
}