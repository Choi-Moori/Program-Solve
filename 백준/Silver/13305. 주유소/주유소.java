import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {


        long res = 0;

        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        sc.nextLine();
        String st = sc.nextLine();
        String st2 = sc.nextLine();

        StringTokenizer distant = new StringTokenizer(st, " ");
        StringTokenizer cost = new StringTokenizer(st2, " ");


        long temp = Integer.parseInt(cost.nextToken());

        for(int i = 0; i < n-1 ; i++){
            long dis = Integer.parseInt(distant.nextToken());
            res += temp*dis;

            temp = Math.min(temp, Integer.parseInt(cost.nextToken()));
        }
        System.out.println(res);

    }
}