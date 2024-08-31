import java.util.*;

class Min_Cost_Climbing_Stairs{
	
	public static int minCostClimbingStairs(int[] arr, int n){
		int c = arr[n-2];
		int r = arr[n-1];
		
		for(int i=n-3;i>=0;i--){
			arr[i] = Math.min(arr[i]+r,arr[i]+c);
			c = r;
			r = arr[i];
		}
		
		
		return Math.min(arr[0],arr[1]);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println(minCostClimbingStairs(arr,n));
	}
}