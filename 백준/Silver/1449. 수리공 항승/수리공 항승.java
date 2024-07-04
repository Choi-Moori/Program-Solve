import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] opt = new int[2];
        int count = 0;
        for(String s : br.readLine().split(" ")){
            opt[count++] = Integer.parseInt(s);
        }
        count = 0;
        int[] num = new int[opt[0]];
        for(String s: br.readLine().split(" "))
            num[count++] = Integer.parseInt(s);
        Arrays.sort(num);

        int temp = 0;
        int result = 0;

        for(int i = 0 ; i < opt[0] ; i++){
            if(num[i] > temp){
                result++;
                temp = num[i];
                temp += opt[1]-1;
            }
        }
        System.out.println(result);
    }
}
