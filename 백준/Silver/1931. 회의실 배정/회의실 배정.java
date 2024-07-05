import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[][] numlist = new int[num+1][2];
        int count = 1;

        for(int i = 1 ; i < num+1;i++){
            String[] s = br.readLine().split(" ");
            numlist[i][0] = Integer.parseInt(s[0]);
            numlist[i][1] = Integer.parseInt(s[1]);
        }
        Arrays.sort(numlist, (a,b) -> {
            if(a[1] == b[1]){
                return a[0]-b[0];
            }
            return a[1]-b[1];
        });

        int[] temp = numlist[1];
        for(int i = 2 ; i < num+1 ; i++){
            if(temp[1] <= numlist[i][0]){
                temp = numlist[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
