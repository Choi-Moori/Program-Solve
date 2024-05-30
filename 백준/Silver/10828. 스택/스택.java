import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> al = new Stack<>();

        int num = Integer.parseInt(bf.readLine());

        while(num --> 0){
            String str = bf.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            while(st.hasMoreTokens()){
                String token = st.nextToken();
                if(token.equals("push"))
                    al.add(Integer.parseInt(st.nextToken()));
                else if(token.equals("pop")){
                    System.out.println(al.isEmpty() ? -1 : al.pop());
                }
                else if(token.equals("size"))
                    System.out.println(al.size());
                else if(token.equals("empty"))
                    System.out.println(al.isEmpty() ? 1 : 0);
                else if(token.equals("top"))
                    System.out.println(al.isEmpty() ? -1 : al.peek());
            }
        }
    }
}