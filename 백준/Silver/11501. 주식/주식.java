import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        while(tc --> 0){
            int num = Integer.parseInt(br.readLine());
            int[] numlist = new int[num];
            int j = 0;
            long res = 0;
            for(String s : br.readLine().split(" ")) {
                int temp = Integer.parseInt(s);
                numlist[j++] = temp;
            }

            int temp = numlist[j-1];
            for(int i = numlist.length-2 ; i >= 0; i--){
                if(numlist[i] > temp){
                    temp = numlist[i];
                }
                else {
                    res += temp-numlist[i];
                }
            }
            System.out.println(res);
        }
    }
}
