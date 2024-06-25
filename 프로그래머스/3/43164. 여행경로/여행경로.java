import java.util.*;

class Solution {
    static boolean[] visit;
    static List<String> res = new ArrayList<>();

    public static List<String> solution(String[][] tickets) {
        String[] answer = new String[tickets.length+1];
        visit = new boolean[tickets.length];
        Arrays.sort(tickets, (a,b) -> {
            return a[1].compareTo(b[1]);
        });
        dfs("ICN", tickets, new ArrayList<>());

        return res;
    }

    public static boolean  dfs(String current, String[][] tickets, List<String> path){
        path.add(current);
        if (path.size() == tickets.length + 1) {
            res.addAll(path);
            return true;
        }
        for (int i = 0; i < tickets.length; i++) {
            if (!visit[i] && tickets[i][0].equals(current)) {
                visit[i] = true;
                if (dfs(tickets[i][1], tickets, path)) {
                    return true;
                }
                visit[i] = false;
            }
        }

        path.remove(path.size() - 1);
        return false;
    }
}