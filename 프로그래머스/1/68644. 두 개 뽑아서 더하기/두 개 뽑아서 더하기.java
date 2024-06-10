import java.util.*;
class Solution {
    public List<Integer>/*int[]*/ solution(int[] numbers) {
        List<Integer> answerlist = new ArrayList<>();
        for(int i = 0 ; i < numbers.length ; i++){
            for(int j = i+1 ; j < numbers.length ; j++){
                int num = numbers[i] + numbers[j];
                if(!answerlist.contains(num))
                    answerlist.add(num);
            }
        }
        Collections.sort(answerlist);
        System.out.println(answerlist);
//         int[] answer1 = new int[numbers.length*numbers.length];
//         int num = 0;
        
//         for(int i = 0 ; i < numbers.length ; i++){
//             for (int j = i+1 ; j < numbers.length ; j++){
//                 answer1[num++] = numbers[i] + numbers[j];
//             }
//         }
        
//         answer1 = Arrays.copyOf(answer1, num);
//         Arrays.sort(answer1);
//         num = 0;
//         int[] answer = new int[answer1.length];
//         for(int i = 0 ; i < answer.length ; i++){
//             if(i == 0 || answer1[i] != answer1[i-1]){
//                 answer[num++] = answer1[i];
//             }
//         }
        
        return answerlist;
    }
}