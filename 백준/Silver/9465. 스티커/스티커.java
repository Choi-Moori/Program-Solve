import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        while(tc --> 0){
            int size = Integer.parseInt(br.readLine());
            int[][] num = new int[2][size];
            for(int i = 0 ; i < 2 ; i++){
                int j = 0;
                for(String st : br.readLine().split(" ")){
                    num[i][j++] = Integer.parseInt(st);
                }
            }
            for(int i =1 ; i < size; i++){
                num[0][i] = Math.max(num[0][i-1] , num[1][i-1]+num[0][i]);
                num[1][i] = Math.max(num[0][i-1] + num[1][i] , num[1][i-1]);
            }
            System.out.println(Math.max(num[0][size-1], num[1][size-1]));
        }
    }
}
