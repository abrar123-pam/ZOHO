import java.util.*;

class task4{
	
	public static boolean solve(int index,int[] arr, int n, int target){
		if(index >= n)
			return false;
		if(target <0)
			return false;
		if(target == 0)
			return true;
			
		boolean include =solve(index+1,arr,n,target - arr[index]);
		boolean exclude = solve(index+1,arr,n,target-0);
		
		return include || exclude;
	}


	public static boolean equalPartition(int[] arr, int n){
		int total = 0;
		for(int i=0;i<n;i++){
			total += arr[i];
		}
			
		if(total %2 != 0)
			return false;
			
		int target = total/2;
		
		return solve(0,arr,n,target);
	}
	
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		for(int i=0;i<len;i++){
			arr[i] = sc. nextInt();
		}
		
		
		System.out.println(equalPartition(arr,len));
		
	}
}