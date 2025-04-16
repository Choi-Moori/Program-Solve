class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health - attacks[0][1];
        int temp = attacks[0][0]; 
        
        for(int i = 1 ; i < attacks.length ; i++){
            int k = 0;
            for(int j = temp+1 ; j < attacks[i][0] ; j++){
                k++;
                answer += bandage[1];
                
                if(k == bandage[0]){
                    answer += bandage[2];
                    k = 0;
                }
                
                
                if(answer > health){
                    answer = health;
                }
            }
            
            if(answer - attacks[i][1] <= 0){
                answer = -1;
                break;
            }
            else
                answer -= attacks[i][1];
            temp = attacks[i][0];
        }
        
        return answer;
    }
}