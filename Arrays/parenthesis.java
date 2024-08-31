package Practice;

import java.util.ArrayList;
import java.util.List;

public class parenthesis {

    public static void check(int n, int open, int close, ArrayList<String> res,String s){
        if(s.length() == 2*n){
            res.add(s);
            System.out.println(s+" ________");
            return;
        }
        if(open < n){
            check(n,open+1,close,res,s+"(");
            System.out.println(s+ " "+open + " " + close);
        }

        if(close < open){
            check(n,open,close+1,res,s+")");
            System.out.println(s+ " "+open + " " + close);
        }

    }

    public static List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        check(n,0,0,res,"");
        return res;

    }

    public static void main(String[] args) {
        //List<String> ans = generateParenthesis(3);
        System.out.println(1/3);
        System.out.println(1%4);
    }
}
