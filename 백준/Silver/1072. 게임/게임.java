import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");
        int X = Integer.parseInt(st[0]);
        int Y = Integer.parseInt(st[1]);
        int tag = oper(X,Y);
        binary_search(tag, X, Y);

    }
    public static void binary_search(int tag, int X, int Y){
        int start = 0;
        int end = X;
        int count = -1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (oper(X + mid, Y + mid) != tag) {
                count = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(count);
    }

    public static int oper(int X, int Y){
        return (int) ( (long) Y * 100 / X );
    }
}
