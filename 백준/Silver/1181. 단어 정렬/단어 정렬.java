import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Set<String> stl = new HashSet<>();
        int num = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < num ; i ++){
            stl.add(br.readLine());
        }
        ArrayList<String> result = new ArrayList<>(stl);

        result.sort((o1, o2) -> {
            if(o1.length() == o2.length())
                return o1.compareTo(o2);
            return o1.length() - o2.length();
        });

        for(String i : result)
            sb.append(i).append("\n");

        System.out.println(sb);
    }

}
