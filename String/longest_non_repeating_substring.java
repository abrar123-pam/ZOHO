package LeetCode;

import java.util.ArrayList;

public class longest_non_repeating_substring {

    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        //ArrayList<String> list = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = 0;
            for (int j = i ; j < s.length()-1; j++) {
                String str = s.substring(i,j+1);
                if(isUnique(str)) {
                    System.out.println(str);
                    curr++;
                    count = Math.max(count,curr);

                }

            }
        }

        return count;
    }

    private static boolean isUnique(String str) {
        if(str.length() == 1) return true;

        for(int i = 0 ; i < str.length() ; i++){
            for(int j = i+1 ; j < str.length() ; j++){
                if(str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }

        return true;
    }

}
