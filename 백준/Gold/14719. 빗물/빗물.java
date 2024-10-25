import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");

        int height = Integer.parseInt(st[0]);
        int width = Integer.parseInt(st[1]);
        int[] board = new int[width];

        String[] blocks = br.readLine().split(" ");
        for (int i = 0; i < width; i++) {
            board[i] = Integer.parseInt(blocks[i]);
        }

        int result = 0;
        int[] leftMax = new int[width];
        int[] rightMax = new int[width];

        leftMax[0] = board[0];
        for (int i = 1; i < width; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], board[i]);
        }

        rightMax[width - 1] = board[width - 1];
        for (int i = width - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], board[i]);
        }

        for (int i = 0; i < width; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            if (minHeight > board[i]) {
                result += minHeight - board[i];
            }
        }

        System.out.println(result);
    }
}