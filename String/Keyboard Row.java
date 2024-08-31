package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class string {
    public static  String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        ArrayList<String> list = new ArrayList<>();

        for(String str : words){
            if(match(str,s1) || match(str,s2) || match(str,s3)){
                list.add(str);
            }
        }

        System.out.println(list);

        String[] ans = new String[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }

        return ans;
    }

    public static boolean match(String str,String s){
        int count =0;
        for(int i=0;i<str.length();i++){
            for (int j=0;j<s.length();j++){

            }
        }

        return count == str.length();
    }

    public static void main(String[] args) {
        String[] arr = {"Hello","Alaska","Dad","Peace"};
        String[] ans = findWords(arr);
        System.out.println(Arrays.toString(ans));

    }
}