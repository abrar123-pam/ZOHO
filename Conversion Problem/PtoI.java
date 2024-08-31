package ConversionProblems;

import java.util.Stack;

public class PtoI {

    static boolean isOperator(char ch) {
        switch (ch){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return true;
        }
        return false;
    }

    public static String prefixtoinfix(String exp){
        Stack<String> stack = new Stack<>();

        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);

            if(isOperator(ch)){
                String top1 = stack.pop();
                String top2 = stack.pop();

                String temp = ch+top2+top1;
                stack.push(temp);
            }else{
                stack.push(ch+"");
            }

        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "AB*C+";
        System.out.println(prefixtoinfix(exp));
    }
}
