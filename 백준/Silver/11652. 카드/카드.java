import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Long, Long> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ; i++){
            Long num = Long.parseLong(br.readLine());
            map.put(num , map.getOrDefault(num, 0L) + 1L);
        }


        List<Map.Entry<Long, Long>> entryList = new LinkedList<>(map.entrySet());

        entryList.sort((a,b) -> {
            int compare = b.getValue().compareTo(a.getValue());
            if(compare == 0){
                return a.getKey().compareTo(b.getKey());
            }
            return compare;
        });
        
        System.out.println(entryList.get(0).getKey());

    }
}
