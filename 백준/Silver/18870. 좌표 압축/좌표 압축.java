import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] numlist = new int[n];
        int[] reslist = new int[n];

        StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
        int i = 0;
        while(stt.hasMoreTokens()){
            int num = Integer.parseInt(stt.nextToken());
            numlist[i] = num;
            reslist[i++] = num;
        }
        Arrays.sort(reslist);
        int count = 0;
        HashMap<Integer, Integer> res = new HashMap<>();

        for(int j = 0 ; j < n ; j++){
            if(!res.containsKey(reslist[j]))
                res.put(reslist[j], count++);
        }
        StringBuilder sb = new StringBuilder();

        for(int j = 0 ; j< n ;j++){
            if(res.containsKey(numlist[j]))
                sb.append(res.get(numlist[j])).append(" ");
        }
        System.out.println(sb);


    }
}
