import java.util.Scanner;

public class task10 {

    static void sort(int[] arr, int st, int end) {
        for (int i = st; i < end - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < end; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    static int[] findSortArr(int[] arr, int n, int m, int q) {
        int[] ans = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0 && m % arr[i] == 0) {
                ans[k++] = arr[i];
                arr[i] = -1;
            }
        }

        sort(ans, 0, k); // Sorting elements added in the first loop

        for (int i = 0; i < n; i++) {
            if (arr[i] != -1 && arr[i] != 0 && q % arr[i] == 0) {
                ans[k++] = arr[i];
                arr[i] = -1;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                ans[k++] = arr[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = sc.nextInt();

        System.out.print("Enter n: ");
        int q = sc.nextInt();

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        int[] arr = new int[l];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = findSortArr(arr, l, m, q);
        System.out.println("Sorted array:");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
