import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        while(tc --> 0){
            int num = Integer.parseInt(br.readLine());
            int[] numlist = new int[num+1];
            for(int i = 0 ; i < num ; i++){
                String[] s = br.readLine().split(" ");
                numlist[Integer.parseInt(s[0])] = Integer.parseInt(s[1]);
            }
            int count = 1;
            int temp = numlist[1];
            for (int i = 1 ; i < num+1; i++){
                if(numlist[i] < temp){
                    temp = numlist[i];
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
