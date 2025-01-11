import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int[][] temp = new int[prices.length][2];
        for(int i = 0 ; i < prices.length; i++){
            temp[i][0] = prices[i];
            temp[i][1] = 0;
        }
        for(int i = 0 ; i < prices.length; i++){
            for(int j = i+1 ; j < prices.length ; j++){
                if(temp[i][0] <= temp[j][0]){
                    temp[i][1]++;
                }
                else{
                    temp[i][1]++;
                    break;
                }
            }
            answer[i] = temp[i][1];
        }
        return answer;
    }
}