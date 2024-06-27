class Solution {
    public int solution(int n) {
        int answer = 0;
        int start = 1;
        int end = 2;
        int temp = start;

        while(start != n+1){
            if(temp == n){
                answer++;
                start++;
                temp = start;
                end=start+1;
            }
            else if(temp> n){
                temp -= start;
                start++;
            }
            else if(temp <= n){
                temp+= end;
                end++;
            }
        }

        return answer;
    }
}