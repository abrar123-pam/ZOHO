import java.util.*;

class task3{
	
	public static int[] rotate(int[] arr, int n, int k){
	
		for(int i=0;i<k;i++){
			
			int temp = arr[n-1];
			for(int j=n-1;j>0;j--){
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
		
		return arr;
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		for(int i=0;i<len;i++){
			
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter k : ");
		int k = sc.nextInt();
		
		
		
		int[] ans = rotate(arr,len,k);
		
		for(int i=0;i<len;i++){
			System.out.print(ans[i] + " ");
		}
	}
}