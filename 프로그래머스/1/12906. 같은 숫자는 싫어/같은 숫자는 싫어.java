import java.util.*;

public class Solution {
    public ArrayList solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        answer.add(arr[0]);
        int j = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if (answer.get(j) != arr[i]){
                answer.add(arr[i]);
                j++;
            }
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
}