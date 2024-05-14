import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int res = 0;
        boolean sw = true;
        String st = sc.nextLine();
        StringTokenizer stt = new StringTokenizer(st, "[-+]", true);

        while (stt.hasMoreTokens()){
            String temp = stt.nextToken();
            int num = 0;
            if(temp.equals("-"))
                sw = false;
            else if(!temp.equals("+"))
                num = Integer.parseInt(temp);

            if(sw)
                res += num;
            else
                res -= num;

        }
        System.out.println(res);
    }
}
