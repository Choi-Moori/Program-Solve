class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] res = new int[n][m];
        boolean end = true;
        if(puddles[0].length > 0){
            for(int x[] : puddles){
                res[x[1]-1][x[0]-1] = -1;
            }
        }
        for(int i = 1 ;i < n; i++){
            res[i][0] = (res[i][0] == -1 | res[i-1][0] == -1) ? -1 : 1;
        }
        for(int j = 1 ;j < m ;j++){
            res[0][j] = (res[0][j] == -1 | res[0][j-1] == -1) ? -1 : 1;
        }

        for(int i = 1; i < n ; i++){
            for(int j = 1 ; j < m ; j++){
                if(res[i][j] != -1){
                    int a = res[i-1][j] == -1 ? 0 : res[i-1][j];
                    int b = res[i][j-1] == -1 ? 0 : res[i][j-1];
                    res[i][j] = (a+b) == 0 ? -1 : (a+b) % 1000000007;
                }
            }
        }

        return res[n-1][m-1] == -1? 0 : res[n-1][m-1];

    }
}