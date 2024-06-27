class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] res = new int[n][m];
        boolean end = true;
        for(int[] i : puddles)
            res[i[1]-1][i[0]-1] = -1;
        for(int i = 1 ; i < m ; i++){
            if(res[0][i] == -1) end=false;
            if(end) res[0][i] = 1;
            else res[0][i] = -1;
        }
        end = true;
        for(int i = 1 ; i < n ; i++){
            if(res[i][0] == -1) end=false;
            if(end) res[i][0] = 1;
            else res[i][0] = -1;
        }

        res[0][0] =1;

        for(int i = 1; i < n ; i++){
            for(int j = 1 ; j < m;j++ ){
                if(res[i][j] != -1){
                    if(res[i-1][j] == -1){
                        res[i][j] = res[i][j-1];
                    }
                    else if(res[i][j-1] == -1){
                        res[i][j] = res[i-1][j];
                    }
                    else{
                        res[i][j] = (res[i-1][j] + res[i][j-1])%1000000007;
                    }
                }
            }
        }

        return Math.max((res[n - 1][m - 1]), 0);
    }
}