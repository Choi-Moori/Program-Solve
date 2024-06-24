import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
//    static boolean[] visit;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int n = Integer.parseInt(br.readLine());
//        List<Integer> pq = new ArrayList<>();
//
//        for(int i = 0 ; i < n ; i++){
//            pq.add(Integer.parseInt(br.readLine()));
//        }
//
//        Collections.sort(pq);
//
//        for(int i : pq)
//            sb.append(i).append("\n");
//        System.out.println(sb);
//    }
static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        heapSort(arr);

        for(int i : arr)
            sb.append(i).append("\n");

        System.out.println(sb);
    }
    public static void heapSort(int[] intArr){
        int n = intArr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(intArr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = intArr[0];
            intArr[0] = intArr[i];
            intArr[i] = temp;
            heapify(intArr, i, 0);
        }
    }

    public static void heapify(int[] intArr, int n, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && intArr[left] > intArr[largest]) {
            largest = left;
        }
        if (right < n && intArr[right] > intArr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int swap = intArr[i];
            intArr[i] = intArr[largest];
            intArr[largest] = swap;
            heapify(intArr, n, largest);
        }
    }
}
