import java.util.Scanner;

public class Main {
    static int zero=0;
    static int one=0;
    static int minus=0;
    static int[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean end = true;
        int n = sc.nextInt();
        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = sc.nextInt();
                board[i][j] = temp;
            }
        }
        regress(0,0,n);

        System.out.println(minus + "\n" + zero + "\n" + one);
    }

    public static void regress(int row, int col, int size){

        if(check(row,col,size)){
            if(board[row][col] == 0)
                zero++;
            else if (board[row][col] == 1)
                one++;
            else
                minus++;

            return;
        }

        int newsize = size/3;

        regress(row,col,newsize);
        regress(row,col+newsize,newsize);
        regress(row,col+2*newsize,newsize);

        regress(row+newsize, col,newsize);
        regress(row+newsize, col+newsize, newsize);
        regress(row+newsize, col+2*newsize, newsize);

        regress(row+2*newsize, col, newsize);
        regress(row+2*newsize, col+newsize, newsize);
        regress(row+2*newsize, col+2*newsize,newsize);
    }

    private static boolean check(int r, int c, int size){
        int col = board[r][c];
        for(int i = r ; i <r+size; i++){
            for(int j = c; j < c+size; j++){
                if(col != board[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
