import java.util.*;

class task6 {
    public static void checkForGoodString(String input, int k, int m) {
        int n = input.length();
        StringBuilder sb = new StringBuilder(input);
        int count = 0;
        for (int i = 0; i <= n - 4; i++) {
            if (isValid(sb, i, i + 4, m)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isValid(StringBuilder sb, int s, int e, int m) {
        String sub = sb.substring(s, e);
        int countOnes = 0;
        for (int i = 0; i < sub.length(); i++) {
            if (sub.charAt(i) == '1') { 
                countOnes++;
            }
        }
        if (countOnes < m) {
            return true;
        }
        for (int j = 0; j < sub.length(); j++) {
            if (sub.charAt(j) == '1') { // Corrected to compare with character '1'
                int index = s + j;
                sb.setCharAt(index, '0'); // Corrected to set character at specific index
            }
        }
        return false; // Added return statement to satisfy method signature
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int k = sc.nextInt();
        int m = sc.nextInt();

        checkForGoodString(input, k, m);
    }
}
