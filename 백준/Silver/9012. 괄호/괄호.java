import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(bf.readLine());

        for(int i = 0 ; i < tc; i++){
            int count = 0;

            ArrayList<Character> st = new ArrayList<>();

            String str = bf.readLine();
            for (int j = 0 ; j < str.length(); j++){
                st.add(str.charAt(j));
            }

            for (Character ch : st){
                if(count < 0) break;

                if(ch.equals('('))
                    count += 1;
                else if(ch.equals(')'))
                    count -= 1;
            }

            System.out.println(count == 0 ? "YES" : "NO");
        }
    }
}
