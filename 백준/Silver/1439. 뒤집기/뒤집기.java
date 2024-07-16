import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String[] st = br.readLine().split("");
        count = st[0].equals("0")? 1 : 0;
        int count1 = st[0].equals("1")?1:0;
        for(int i = 1 ; i < st.length;i++){
            if(!st[i-1].equals(st[i])){
                if(st[i].equals("0")) count++;
                else count1++;
            }
        }

        System.out.println(Math.min(count, count1));
    }
}
