import java.util.*;

class K_ClosestPointOrigin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        kvalue(arr, k);
    }

    public static void kvalue(int[][] arr, int k) {
		int n = arr.length;
		int m = arr[0].length;
        int[] closestIndices = new int[k];
        for (int i = 0; i < k; i++) {
            closestIndices[i] = i;
        }
        sortClosest(arr, closestIndices, k);
        for (int i = k; i < n; i++) {
            double distI = distance(arr[i]);
            if (distI < distance(arr[closestIndices[k - 1]])) {
                insertClosest(arr, closestIndices, k, i);
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println(Arrays.toString(arr[closestIndices[i]]));
        }
    }

    private static double distance(int[] point) {
        return Math.sqrt(point[0] * point[0] + point[1] * point[1]);
    }

    private static void sortClosest(int[][] arr, int[] closestIndices, int k) {
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - 1 - i; j++) {
                if (distance(arr[closestIndices[j]]) > distance(arr[closestIndices[j + 1]])) {
                    int temp = closestIndices[j];
                    closestIndices[j] = closestIndices[j + 1];
                    closestIndices[j + 1] = temp;
                }
            }
        }
    }

    private static void insertClosest(int[][] arr, int[] closestIndices, int k, int newIndex) {
        double newDist = distance(arr[newIndex]);
        int i;
        for (i = k - 1; i > 0 && distance(arr[closestIndices[i - 1]]) > newDist; i--) {
            closestIndices[i] = closestIndices[i - 1];
        }
        closestIndices[i] = newIndex;
    }
}