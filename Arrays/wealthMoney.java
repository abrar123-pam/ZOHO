import java.util.*;

class wealthMoney{


	public static void findWealthCustomer(int[][] mat, int n, int m){
	
		int max = 0;
		
		for(int i=0;i<n;i++){
			int sum = 0;
			for(int j=0;j<m;j++){
				sum += mat[i][j];
			}
			max = Math.max(max, sum);
		}
		
		System.out.println(max);
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row  : " );
		int row = sc.nextInt();
		
		System.out.print("Enter coloum  : " );
		int col = sc.nextInt();
		
		int[][] mat = new int[row][col];
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				mat[i][j]=sc.nextInt();
			}
		}
		
		findWealthCustomer(mat,row,col);
		
	}
}