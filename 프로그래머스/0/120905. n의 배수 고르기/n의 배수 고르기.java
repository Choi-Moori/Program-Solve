import java.util.*;

class Solution {
    public List<Integer> solution(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> res = new ArrayList<>();
        for(int i : numlist){
            if(i % n == 0)
                res.add(i);
        }
        return res;
    }
}