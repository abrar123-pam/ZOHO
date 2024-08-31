import java.util.*;

class test3{
	
	public static int oddSubarrays(int n , int[] arr){
		int total_count = 0;
		
		for(int i=0;i<n;i++){
			int count  = 0;
			for(int j=i;j<n;j++){
				count += arr[j];
				if( (j-i+1) % 2 != 0){
					total_count += count;
				}
			}
		}
		
		return total_count;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println(oddSubarrays(n,arr));
		
	}
}