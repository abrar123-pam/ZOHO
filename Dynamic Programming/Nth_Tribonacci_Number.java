import java.util.*;

class Nth_Tribonacci_Number{

	public static int solve(int[] dp, int n){
		if(n == 0){
			return dp[0];
		}
		if(n == 1)
			return dp[1];
		if(n == 2)
			return dp[2];
			
		for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
		return dp[n];
	}

	public static int tribnocci(int n){
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		if(n == 2)
			return 1;
		
		int[] dp = new int[n+1];
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		
		return solve(dp,n);
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	
	
		System.out.println(tribnocci(n));
		
		
	}
}