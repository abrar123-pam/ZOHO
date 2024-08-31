import java.util.*;

class Spiral {

    public static void check(int left, int right, int top, int btm, int r, int c, int[][] arr, ArrayList<Integer> list){

        if (top > btm || left > right) {
            return;
        }

        for (int i = left; i <= right; i++) {
            list.add(arr[top][i]);
        }
        top++;

        for (int i = top; i <= btm; i++) {
            list.add(arr[i][right]);
        }
        right--;

        if (top <= btm) {
            for (int i = right; i >= left; i--) {
                list.add(arr[btm][i]);
            }
            btm--;
        }

        if (left <= right) {
            for (int i = btm; i >= top; i--) {
                list.add(arr[i][left]);
            }
            left++;
        }
        check(left, right, top, btm, r, c, arr, list);
    }

    public static void printSpiral(int r, int c, int[][] arr){
        ArrayList<Integer> list = new ArrayList<>();

        int l = 0, right = c-1, t = 0, b = r-1;

        check(l, right, t, b, r, c, arr, list);

        System.out.println(Arrays.toString(list.toArray()));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
		
	
        printSpiral(4, 4, arr);
    }
}
