import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();
        while(count --> 0){
            String input = bf.readLine();
            StringTokenizer sT = new StringTokenizer(input);
            int num = Integer.parseInt(sT.nextToken());
            boolean isEmpty = stack.isEmpty();
            if(sT.hasMoreTokens())
                stack.push(Integer.parseInt(sT.nextToken()));
            else if (num == 2)
                sb.append(isEmpty? -1 : stack.pop()).append("\n");
            else if (num == 3)
                sb.append(stack.size()).append("\n");
            else if (num == 4)
                sb.append((isEmpty? 1 : 0)).append("\n");
            else if (num == 5)
                sb.append(isEmpty? -1 : stack.peek()).append("\n");
        }
        System.out.println(sb);
    }
}
