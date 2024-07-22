import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int[] res = new int[26];
        Arrays.fill(res,-1);

        for(int i = 0 ; i < str.length(); i++){
            int num = str.charAt(i) - 'a';
            if(res[num] == -1){
                res[num] = i;
            }
        }
        for(int i : res)
            sb.append(i).append(" ");
        System.out.println(sb);
    }
}
