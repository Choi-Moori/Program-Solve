import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static boolean[] visit;
    static int[] list;
    static List<Integer> num;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        num = new ArrayList<>();

        for(String st : str.split(" ")){
            num.add(Integer.parseInt(st));
        }
        visit = new boolean[num.get(0)+1];
        list = new int[num.get(1)];

        permutation(0, 1);
    }

    static void permutation(int count, int start){
        if(count == num.get(1)){
            for(int i : list){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for(int i = start ; i <= num.get(0) ; i++){
            if(!visit[i]){
                visit[i] = true;
                list[count] = i;
                permutation(count+1 , i);
                visit[i] = false;
            }
        }
    }

}
