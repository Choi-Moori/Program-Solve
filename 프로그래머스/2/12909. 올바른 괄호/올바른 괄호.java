class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] st = s.split("");
        int i = 0;
        for(String str : st) {
            if(str.equals("("))
                i++;
            else
                i--;

            if (i < 0){
                return false;
            }
        }
        
        
        return i > 0 ? false : answer;
    }
}