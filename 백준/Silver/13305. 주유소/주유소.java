import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] distant, cost;
        int res = 0;


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        distant = new int[n-1];
        cost = new int[n];

        for(int i = 0 ; i < n-1; i++)
            distant[i] = sc.nextInt();

        for(int i = 0; i<n ; i++)
            cost[i] = sc.nextInt();

        int temp = cost[0];

        for(int i = 0; i < n-1 ; i++){
            res += temp*distant[i];

            temp = Math.min(temp, cost[i+1]);
        }
        System.out.println(res);

    }
}
