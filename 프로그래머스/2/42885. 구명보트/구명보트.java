import java.util.*;
class Solution {
    public static int solution(int[] people, int limit){
        int count = 0;
        Arrays.sort(people);
        int i = 0;
        int j = people.length-1;
        while(i<j){
            if(people[i] + people[j] > limit){
                count++;
                j--;
            }
            else{
                i++;
                j--;
                count++;
            }
        }
        if(i==j) count++;
        return count;
    }
}