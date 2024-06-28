import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> sta = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        int[] res = new int[n];
        int k = 0;
        for(String s : br.readLine().split(" ")){
            num[k++] = Integer.parseInt(s);
        }
        for(int i = 0 ; i < n; i++){
            while(!sta.isEmpty() && num[sta.peek()] < num[i]){
                res[sta.pop()] = num[i];
            }
            sta.add(i);
        }
        while(!sta.isEmpty()){
            res[sta.pop()] = -1;
        }
        for(int i : res) sb.append(i).append(" ");
        System.out.println(sb);
    }
}
