import java.util.*;

class Solution {
    Map<String, Integer> result = new TreeMap<>();
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String record : records){
            String[] st = record.split(" ");
            
            if(st[2].equals("IN")){
                map = EntryCar(st, map);
            }
            else if(st[2].equals("OUT")){
                map = outCar(st, map);
            }
        }

        for (String st : map.keySet()) {
            int time = (23 * 60 + 59) - map.get(st);
            result.put(st, result.getOrDefault(st, 0) + time);
        }
        
        int[] answer = new int[result.size()];
        
        int i = 0;
        
        for(String st : result.keySet()){
            int totalTime = result.get(st);
            int extraTime = Math.max(0, totalTime - fees[0]);
            int fee = (int)Math.ceil((double)extraTime/fees[2]);
            answer[i++] = fees[1] + fee * fees[3];
        }
        
        return answer;
    }
    
    public Map<String,Integer> EntryCar(String[] st, Map<String, Integer> map){
        
        String[] times = st[0].split(":");
                
        int time = Integer.parseInt(times[0]) * 60;
        time += Integer.parseInt(times[1]);
        
        map.put(st[1], time);
        
        return map;
    }
    
    public Map<String, Integer> outCar(String[] st, Map<String, Integer> map){
        String[] times = st[0].split(":");
        
        int time = Integer.parseInt(times[0])*60;
        time += Integer.parseInt(times[1]);
        
        int temp = map.get(st[1]);
        
        if(result.containsKey(st[1])){
            int resultTime = result.get(st[1]) + (time-temp);
            result.replace(st[1], resultTime);
        }
        else{
            result.put(st[1], time-temp);
        }
        
        map.remove(st[1]);
        
        
        return map;
    }
}