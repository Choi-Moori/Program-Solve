import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> myMap = new HashMap<>();
        
        for(String[] i : clothes){
            myMap.put(i[1] , myMap.getOrDefault(i[1], 1)+1);
        }
        System.out.println(myMap);
        for(String i : myMap.keySet()){
            answer *= myMap.get(i);
        }
        return answer-1;
    }
}