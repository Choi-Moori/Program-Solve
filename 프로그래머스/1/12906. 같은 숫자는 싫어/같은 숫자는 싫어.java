import java.util.*;

public class Solution {
    public ArrayList solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        int j = arr[0];
        for(Integer i : arr){
            if(j != i)
                answer.add(i);
            j = i;
        }
        return answer;
    }
}