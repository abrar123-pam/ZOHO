import java.util.*;

class task5{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements : ");

        int e = sc.nextInt();

        int[] arr = new int[e];

        for (int i = 0; i < e; i++) {

            arr[i] = sc.nextInt();
        }

        int closest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (absoluteValue(arr[i]) < absoluteValue(closest)) {
                closest = arr[i];
            } else if (absoluteValue(arr[i]) == absoluteValue(closest) && arr[i] > 0) {
                closest = arr[i];
            }
        }

        System.out.print(closest);

    }

    public static int absoluteValue(int num) {
        return num < 0 ? -num : num;
    }
}
