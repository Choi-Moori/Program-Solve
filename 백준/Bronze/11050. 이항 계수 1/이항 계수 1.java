import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");

        int n = Integer.parseInt(st[0]);
        int k = Integer.parseInt(st[1]);

        int up = fac(n);
        int down = fac(n-k) * fac(k);
        System.out.println(up/down);
    }

    public static int fac(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        return num * fac(num-1);
    }
}
