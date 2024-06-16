import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int[] numl = new int[11];
        numl[1] = 1;
        numl[2] = 2;
        numl[3] = 4;
        for(int i = 4 ; i < 11 ; i++){
            numl[i] = numl[i-1] + numl[i-2] + numl[i-3];
        }

        while(tc --> 0) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(numl[num]);
        }

    }
}
