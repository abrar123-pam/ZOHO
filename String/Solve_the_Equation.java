package LeetCode;

import java.util.Arrays;

public class Solve_the_Equation {
    public static void main(String[] args) {
        String s = "2+x+2=10-4";
        String s1 = "x+5-3+x=6+x-2";

        System.out.println(solveEquation(s1));

        System.out.println(solveEquation(s));
    }

    private static String solveEquation(String s) {

        String[] arr = s.split("=");

        String s1 = arr[0];
     //   System.out.println("s1 "+s1);
        String s2 = arr[1];
     //   System.out.println("s2 "+s2);

        for(int i=0; i<=9; i++){
            char replaceChar = (char) ('0' + i);
            String m1 = s1.replace('x',replaceChar);
           //  System.out.println(m1);

            String m2 = s2.replace('x',replaceChar);
           // System.out.println(m2);
            int x1 = calculate(m1);
            int x2 = calculate(m2);

            if(x1 == x2){
                return "x = "+i;
            }
        }

        return "Infinite Solution";
    }

    private static int calculate(String s1) {
        String[] tokens = s1.split("(?=[+-])");
        System.out.println(Arrays.toString(tokens));
        int result = 0;
        boolean add = true;

        for (String token : tokens) {
            if (token.equals("+")) {
                add = true;
            } else if (token.equals("-")) {
                add = false;
            } else {
                int num = Integer.parseInt(token);
                if (add) {
                    result += num;
                } else {
                    result -= num;
                }
            }
        }

        return result;
    }

}
