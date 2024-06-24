import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        String[][] st = new String[n][2];

        for (int i = 0; i < n; i++) {
            int j = 0;
            for (String s : br.readLine().split(" ")) {
                st[i][j++] = s;
            }
        }

        List<String[]> str = new ArrayList<>(Arrays.asList(st));

        str.sort(new Comparator<String[]>() {
            @Override
            public int compare(String[] a, String[] b) {
                int age = Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0]));
                if (age != 0) {
                    return age;
                }
                return 0; // 나이가 같은 경우 원래 순서를 유지
            }
        });

        for (String[] s : str) {
            sb.append(s[0]).append(" ").append(s[1]).append("\n");
        }
        System.out.println(sb);
    }
}
