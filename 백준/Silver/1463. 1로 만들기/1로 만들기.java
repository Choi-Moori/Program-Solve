import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] numlist = new int[num+1];


        for (int j = 2; j < numlist.length; j++){
            numlist[j] = numlist[j-1]+1;

            if(j%2 == 0)
                numlist[j] = Math.min(1+numlist[j/2], numlist[j]);

            if(j%3 == 0)
                numlist[j] = Math.min(1+numlist[j/3], numlist[j]);
        }

        System.out.print(numlist[numlist.length-1]);
    }
}
