import java.util.*;
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        List<String> st = Arrays.asList(my_string.split(""));
        for(String i : st){
            if (!i.equals(letter)) answer += i;
        }
        return answer;
    }
}