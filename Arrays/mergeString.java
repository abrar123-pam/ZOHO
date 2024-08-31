import java.util.*;

class mergeString {
    
    public static String extractDigit(String input, int digit) {
        int n = input.length();
        while (n > digit) {
            List<String> dividedGroups = new ArrayList<>();
            for (int i = 0; i < n; i += digit) {
                dividedGroups.add(input.substring(i, Math.min(i + digit, input.length())));
            }

            StringBuilder sb = new StringBuilder();
            for (String st : dividedGroups) {
                int sum = 0;
                for (int i = 0; i < st.length(); i++) {
                    sum += Character.getNumericValue(st.charAt(i));
                }
                sb.append(sum);
            }
            input = sb.toString();
            n = input.length();
        }

        return input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String input = sc.next();
        System.out.print("Enter digits : ");
        int digit = sc.nextInt();
        String ans = extractDigit(input, digit);
        System.out.println(ans);
    }
}
