import java.util.*;

class Solution {
    static boolean[] visit;
    static int answer;
    public int solution(String begin, String target, String[] words) {
        visit = new boolean[words.length];
        
        List<String> words_list = new ArrayList<>(Arrays.asList(words));
        System.out.println(words_list);
        
        if(!words_list.contains(target)){
            return 0;
        }
        else{
            dfs(begin, target, words, 0);
        }
        
        return answer;
    }
    
    public void dfs(String begin, String target, String[] words, int count){
        if(begin.equals(target)){
            answer = count;
            return;
        }
        
        for(int i = 0 ; i < words.length ; i++){
            if(visit[i]){
                continue;
            }
            int k = 0;
            for(int j = 0; j < begin.length() ; j++){
                if(begin.charAt(j) == words[i].charAt(j)){
                    k++;
                }
            }
            
            if(k == begin.length() -1){
                visit[i] = true;
                dfs(words[i], target, words, count+1);
                visit[i] = false;
            }
        }
    }
}