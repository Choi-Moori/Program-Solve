import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(bf.readLine());

        for(int i = 0 ; i < tc; i++){
            String str = bf.readLine();
            StringTokenizer sT = new StringTokenizer(str, " ");
            ArrayList<String> al = new ArrayList<>();
            while(sT.hasMoreTokens()){
                al.add(sT.nextToken());
            }

            int num = Integer.parseInt(al.get(0));
            String s = al.get(1);

            for(String j : s.split(""))
                System.out.print(j.repeat(num));
            System.out.println();
        }
    }
}
