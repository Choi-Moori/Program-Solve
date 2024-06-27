class Solution {
    public int solution(int n) {
        int answer = 0;
        int start = 1;
        int end = 2;
        int temp = start;

        while(start != n+1){
            if(temp == n){
                answer++;
                temp += end++;
            }
            else if(temp + end > n){
                temp -= start++;
            }
            else if(temp < n){
                temp+= end++;
            }
        }

        return answer;
    }
}