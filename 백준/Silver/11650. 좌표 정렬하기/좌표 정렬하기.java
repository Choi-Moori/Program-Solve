import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[][] arr = new int[n][2];
        for(int i = 0 ; i < n ; i++){
            int j = 0;
            for(String s : br.readLine().split(" ")){
                arr[i][j++] = Integer.parseInt(s);
            }
        }
        Arrays.sort(arr, (a,b) ->{
            if(a[0] == b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
        for(int i = 0 ; i < n ; i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}
