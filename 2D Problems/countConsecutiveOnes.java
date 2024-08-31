import java.util.*;

class task4 {

    public static int countConsecutiveOnes(int[][] arr, int r, int c) {

        int count = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 1) {
                    count += check(arr, i, j, r, c);
                }
            }
        }

        return count;
    }

    public static int check(int[][] arr, int row, int col, int r, int c) {
        int count = 0;

        if (col + 1 < c && arr[row][col + 1] == 1) {
            count++;
        }
        if (row + 1 < r && arr[row + 1][col] == 1) {
            count++;
        }
        
        

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(countConsecutiveOnes(arr, r, c));
    }
}
