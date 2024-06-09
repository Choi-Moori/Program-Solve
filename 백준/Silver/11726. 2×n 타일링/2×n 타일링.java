import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        int num1 = 1;
        int res = 0;

        while(n-->0){
            res = (num+num1)%10007;
            num = num1;
            num1 = res;
        }
        System.out.println(res);
    }
}
