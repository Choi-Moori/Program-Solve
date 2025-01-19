import java.util.*;

class Solution {
    public int[][] solution(int n) {
        List<int[]> answer = new ArrayList<>();
        hanoi(n , 1 , 3 , 2, answer);

        int[][] result = answer.toArray(new int[answer.size()][]);
        
        return result;
    }
    
    public void hanoi(int n, int start, int end, int sub, List<int[]> answer){
        if(n == 1){
            int[] temp = new int[]{start,end};
            answer.add(temp);
            return;
        }
        else{
            hanoi(n-1, start, sub, end, answer);
            int[] temp = new int[]{start,end};
            answer.add(temp);
            hanoi(n-1, sub, end, start, answer);
        }
    }
}