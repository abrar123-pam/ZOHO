import java.util.*;

class DecodeWays{
	public static int decodeString(int idx, String s, int n,int[] dp){
		
		if(dp[idx] != -1){
			return dp[idx];
		}
		
		if(idx == n){
			return dp[idx] = 1;
		}
		
		if(s.charAt(idx) == '0')
			return dp[idx] = 0;
		int single = decodeString(idx+1,s,n,dp);
		int mingle = 0;
		if(idx+1 < n){
			
			 if(s.charAt(idx) == '1' || (s.charAt(idx) == '2' && s.charAt(idx+1) <= '6')){
				mingle = decodeString(idx+2,s,n,dp);
			 }
		}
		
		return dp[idx] = single+mingle;
	
	}
	
	 public static int numDecodings(String s) {
        int n = s.length();
		int[] dp = new int[101];
		Arrays.fill(dp,-1);
        return decodeString(0,s,n,dp);
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(numDecodings(s));
	}
}