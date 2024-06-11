import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<ArrayList<String>> res = new ArrayList<>();
        String s;
        int i = 0;
        while((s = bf.readLine())!=null && !s.isEmpty()){
            res.add(new ArrayList<>());
            for(String st : s.split(""))
                res.get(i).add(st);
            i++;
        }
        int num = 0;
        for(i = 0 ; i < res.size() ; i++){
            num = Math.max(num , res.get(i).size());
        }

        StringBuilder sb = new StringBuilder();
        for(i = 0 ; i < num ; i++){
            for(int j = 0 ; j < res.size() ; j++){
                if(i < res.get(j).size())
                    sb.append(res.get(j).get(i));
            }
        }
        System.out.println(sb.toString());
    }
}