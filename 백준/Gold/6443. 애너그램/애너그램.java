import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    static boolean[] visit;
    static Queue<String> pq;
    static char[] st;
    static char[] res;
    static int limit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            st = br.readLine().toCharArray();
            Arrays.sort(st); // 입력 문자를 정렬
            res = new char[st.length];
            visit = new boolean[st.length];
            limit = st.length;
            pq = new PriorityQueue<>();

            dfs(0);

            StringBuilder sb = new StringBuilder();
            String prev = "";
            while (!pq.isEmpty()) {
                String current = pq.poll();
                if (!current.equals(prev)) { // 중복된 결과 제거
                    sb.append(current).append("\n");
                    prev = current;
                }
            }
            System.out.print(sb);
        }
        br.close();
    }

    public static void dfs(int depth) {
        if (depth == limit) {
            pq.add(new String(res));
            return;
        }
        for (int i = 0; i < st.length; i++) {
            if (!visit[i]) {
                // 같은 문자가 연속으로 나오는 것을 방지
                if (i > 0 && st[i] == st[i - 1] && !visit[i - 1]) continue;
                visit[i] = true;
                res[depth] = st[i];
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }
}
