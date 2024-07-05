import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "[-+]", true);
        int res = 0;
        boolean state = true;

        while(st.hasMoreTokens()){
            String temp = st.nextToken();
            int num = 0;
            if(temp.equals("-")){
                state = false;
            }
            else if(!temp.equals("+"))
                num = Integer.parseInt(temp);

            res += state? num : num*(-1);
        }
        System.out.println(res);
    }
}
