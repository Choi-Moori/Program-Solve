import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char b;
        String c = "";
        
        for(int i = 0 ; i < a.length(); i++){
            b = a.charAt(i);
            if ((int) b >= 91)
                System.out.print(String.valueOf(b).toUpperCase());
            else
                System.out.print(String.valueOf(b).toLowerCase());
        }
    }
}