import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String st = bf.readLine();
        int n = st.length();
        boolean res = false;

        if(n == 1)
            res = true;
        else if(n % 2 == 0){
            int i = 0;
            while(i != n){
                char a = st.charAt(i);
                char b = st.charAt(n-1);
                if(a != b) {
                    res = false;
                    break;
                }
                else res = true;
                i++;
                n--;
            }
        }
        else{
            int i = 0;
            while(i+1 != n){
                char a = st.charAt(i);
                char b = st.charAt(n-1);
                if(a != b) {
                    res = false;
                    break;
                }
                else res = true;
                i++;
                n--;
            }
        }

        if(res) System.out.println(1);
        else System.out.println(0);
    }
}
