package test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String regex = "^[A-Za-z0-9-+.]+@[a-zA-Z0-9]+\\.(com|in)+$";
        //subdomain.example.com

        String url = "^(www)\\.[a-zA-Z]+\\.(com)+$";
        String phn = "^(\\+91) [0-9]{9}$";
        Pattern pattern = Pattern.compile(phn);
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()){
            System.out.println("Valid email");
        }else{
            System.out.println("Invalid email");
        }
    }
}
