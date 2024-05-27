import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        for (int i = 0 ; i < num ; i++){
            String st = bf.readLine().toLowerCase();
            StringBuffer sb = new StringBuffer(st);
            sb = sb.reverse();

            String st1 = sb.toString();

            if(st1.equals(st))
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }
}
