import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int[] num = new int[Integer.parseInt(st[0])];
        int i = 0;
        for(String s : br.readLine().split(" "))
            num[i++] = Integer.parseInt(s);

        int res = Integer.parseInt(st[1]);
        Arrays.sort(num);

        for(int j : num){
            if(res >= j){
                res++;
            }
        }
        System.out.println(res);
    }
}
