class Solution {
    public long solution(int n) {
        long[] num = new long[n+1];
        if(n == 1){
            return 1;
        }
        else if(n == 2){
            return 2;
        }
        else if(n == 3){
            return 3;
        }
        else{
            num[1] = 1;
            num[2] = 2;
            num[3] = 3;
            for(int i = 4 ; i <= n ; i++){
                num[i] = (num[i-1])%1234567+num[i-2]%1234567;
            }
        }
        return num[n]%1234567;
    }
}