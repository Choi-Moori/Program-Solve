import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        for(int i = 0 ; i < n ; i++) {
            String st = bf.readLine();
            int[] num = new int[2];
            int j = 0;
            StringTokenizer stt = new StringTokenizer(st, ",");
            while(stt.hasMoreTokens()){
                num[j] = Integer.parseInt(stt.nextToken());
                j++;
            }
            System.out.println(num[0]+num[1]);
        }



        
    }
}
