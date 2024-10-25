import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<int[]> temp = new ArrayList<>();

        String[] st = br.readLine().split(" ");

        int x = Integer.parseInt(st[0]);
        int y = Integer.parseInt(st[1]);
        int result = 0;

        int[] board = new int[y];
        int i = 0;
        for(String str : br.readLine().split(" ")){
            board[i++] = Integer.parseInt(str);
        }

        int[] left = new int[y];
        int[] right = new int[y];
        int[] res = new int[y];
        left[0] = board[0];
        for (i = 1 ; i < y ; i++){
            left[i] = Math.max(left[i-1], board[i]);
        }
        right[y-1] = board[y-1];
        for(i = y-2 ; i >= 0 ; i--){
            right[i] = Math.max(right[i+1], board[i]);
        }

        for(i = 0 ; i < y ; i++){
            result += Math.min(left[i], right[i]) - board[i];
        }
        System.out.println(result);
    }
}
