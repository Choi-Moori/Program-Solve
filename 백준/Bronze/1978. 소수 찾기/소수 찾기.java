import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(bf.readLine());
        int count=0;
        StringTokenizer st = new StringTokenizer(bf.readLine());
        while(N-->0){
            int x =Integer.parseInt(st.nextToken());
            boolean check=false;
            if(x==2) count++;
            for(int i=2;i<x;i++){
                if (x % i == 0) {
                        check = false;
                        break;
                    }
                check=true;
            }
            if(check) count++;
        }
        System.out.println(count);
    }
}