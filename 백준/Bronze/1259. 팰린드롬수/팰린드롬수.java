import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st;
        while(!(st = br.readLine()).equals("0")){
            int j = st.length()-1;
            boolean res = true;

            for(int i = 0 ; i < st.length()/2 ; i++){
                if(st.charAt(i) != st.charAt(j))
                    res = false;
                j--;
            }
            if (res) System.out.println("yes");
            else System.out.println("no");
        }

    }
}
