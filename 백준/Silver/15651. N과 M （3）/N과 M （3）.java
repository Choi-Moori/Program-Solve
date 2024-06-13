import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static boolean[] visit;
    static int[] list;
    static List<Integer> num;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        num = new ArrayList<>();

        for(String st : str.split(" ")){
            num.add(Integer.parseInt(st));
        }
        visit = new boolean[num.get(0)+1];
        list = new int[num.get(1)];

        permutation(0);
        System.out.println(sb);
    }

    static void permutation(int count){
        if(count == num.get(1)){
            for(int i : list){
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1 ; i <= num.get(0) ; i++){
//            if(!visit[i]){
//                visit[i] = true;
                list[count] = i;
                permutation(count+1);
//                visit[i] = false;
//            }
        }
    }

}
