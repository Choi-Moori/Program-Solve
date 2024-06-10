import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
        int[] answer1 = new int[numbers.length*numbers.length];
        int num = 0;
        Arrays.sort(numbers);
        
        for(int i = 0 ; i < numbers.length ; i++){
            for (int j = i+1 ; j < numbers.length ; j++){
                answer1[num] = numbers[i] + numbers[j];
                num++;
            }
        }
        answer1 = Arrays.copyOf(answer1, num);
        Arrays.sort(answer1);
        num = 0;
        int[] answer = new int[answer1.length];
        for(int i = 0 ; i < answer.length ; i++){
            if(i == 0 || answer1[i] != answer1[i-1]){
                answer[num++] = answer1[i];
            }
        }
        answer = Arrays.copyOf(answer, num);
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}