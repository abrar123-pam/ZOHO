import java.util.*;

class longestPalindromicSubstring {
    // public static String longestPalindrome(String s) {
        // if(s.length() == 1) return s;
        // int n = s.length();
        // int st=0;
        // int end =0;
        // int maxLen =0;
        // for(int i=0;i<n;i++){
            // for(int j=i;j<n;j++){
                // String sub = s.substring(i,j+1);
                // if(isPalindromic(sub)){
                    // if(sub.length() > maxLen){
						// maxLen = sub.length();
                        // st = i;
                        // end =j;
                    // }
                // }
            // }
        // }

        // return s.substring(st,end+1);
    // }

    // public static boolean isPalindromic(String sub){
        // if(sub.length() == 1) return true;
        // int i=0;
        // int j = sub.length()-1;

        // while(i<=j){
            // if(sub.charAt(i) != sub.charAt(j)){
                // return false;
            // }
			// i++;
            // j--;
        // }

        // return true;
    // }
	
	public static String countAndSay(int n) {

        String s ="1";

        for(int i=1;i<n;i++){
             StringBuilder sb = new StringBuilder();
             int cnt = 1;
             for(int j=1;j<s.length();j++){
                if(s.charAt(j) == s.charAt(j-1)){
                cnt++;
			 }
            else{
                sb.append(cnt);
                sb.append(s.charAt(j-1));
				System.out.println(sb+"sb");
                cnt=1;
             }
			 }
			 
			 sb.append(cnt);
			 sb.append(s.charAt(s.length() - 1));
        
			s = sb.toString();
             

        
		}
		
        // String ans = "";
        // recursive(n,ans);

         return s;
    }
	
	public static void main(String[] args){
		
		String s = "babad";
		
		System.out.println(countAndSay(4));
	}
}