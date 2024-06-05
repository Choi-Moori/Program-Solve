import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for(int i = 0 ; i < citations.length; i++){
            if(citations[i] == 0) {
                answer = 0;
                continue;
            }
            else if(citations[i] == 1) {
                answer = 1;
                continue;
            }
            int num = citations[i];

            int nummax = Arrays.copyOfRange(citations, i, citations.length).length;

            answer = Math.max(Math.min(num, nummax), answer);
        }
        return answer;
    }
}