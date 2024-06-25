class Solution {
    static int res = 0;
    static boolean[] visit;
    static int[] number;
    static int target;
    
    public int solution(int[] numbers, int targets) {

        number = numbers;
        target = targets;
        
        dfs(0,1);
        
        return res;
    }
    public static void dfs(int num, int depth){
        if(depth == number.length+1) {
            if (num == target) {
                res++;
                return;
            }
            else{
                return;
            }
        }
        dfs(num + number[depth-1], depth + 1);
        dfs(num - number[depth-1], depth + 1);
    }
}