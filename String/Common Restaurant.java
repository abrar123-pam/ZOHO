import java.util.*;

public class task5{

    public static String[] findCommon(String[] arr1, String[] arr2, int n1, int n2) {

        int minSum = Integer.MAX_VALUE;
        List<String> commonRestaurants = new ArrayList<>();
		
        for (int i = 0; i < n1; i++) {
            String restaurant = arr1[i];
            for (int j = 0; j < n2; j++) {
                if (restaurant.equals(arr2[j])) {
                    int sum = i + j;
                    if (sum < minSum) {
                        minSum = sum;
                        commonRestaurants.clear();
                        commonRestaurants.add(restaurant);
                    } else if (sum == minSum) {
                        commonRestaurants.add(restaurant);
                    }
                }
            }
        }

        return commonRestaurants.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        String[] arr1 = new String[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.next();
        }

        int n2 = sc.nextInt();
        String[] arr2 = new String[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.next();
        }

        String[] commonRestaurants = findCommon(arr1, arr2, n1, n2);
        for (String restaurant : commonRestaurants) {
            System.out.println(restaurant);
        }
    }
}
