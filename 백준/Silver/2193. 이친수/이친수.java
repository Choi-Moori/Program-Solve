import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        long temp1 = 1;
        long temp2 = 1;
        long result = 1;
        while(num --> 2){
            result = temp1 + temp2;
            temp1 = temp2;
            temp2 = result;
        }
        System.out.println(result);

    }
}
