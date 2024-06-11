import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<String> st = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        if(num == 1){
            System.out.println(sc.next());
        }
        else{
            for(int i = 0 ; i < num ; i++){
                st.add(sc.next());
            }
            result.append(st.get(0));
            for(int i = 1 ; i < num ; i++){
                for(int j = 0 ; j < result.length() ; j++){
                    if(!(result.substring(j,j+1).equals(st.get(i).substring(j,j+1)))){
                        result.replace(j,j+1,"?");
                    }
                }
            }
            System.out.println(result);
        }
    }
}
