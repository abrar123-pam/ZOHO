import java.util.*;

class UniquePath{
	
	public static int recursive(int[][] dp, int m, int n, int i, int j){
		if(i == m-1 && j == n-1){
			return 1;
		}
		
		if(i >= m || j >= n){
			return 0;
		}
		
		if(dp[i][j] != 0){
			return dp[i][j];
		}
		
		dp[i][j] = recursive(dp,m,n,i+1,j) + recursive(dp,m,n,i,j+1);
		
		return dp[i][j];
	}
	
	public static int uniquePaths(int m, int n){
		
		int[][] dp = new int[m][n];
		
		return recursive(dp,m,n,0,0);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m  = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println(uniquePaths(m,n));
	}
}