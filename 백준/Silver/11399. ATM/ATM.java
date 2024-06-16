import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numlist = new ArrayList<>();
        int num = sc.nextInt();


        for(int i = 0 ; i < num ; i++){
            numlist.add(sc.nextInt());
        }
        Collections.sort(numlist);
        
        int total = numlist.get(0);
        int result = total;
        for(int i = 1 ; i < num ; i++){
            total += numlist.get(i);
            result += total;
        }
        System.out.println(result);
    }
}
