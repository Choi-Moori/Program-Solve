import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int num = Integer.parseInt(sc.nextLine());
        
        System.out.println(st.charAt(num-1));
    }
}