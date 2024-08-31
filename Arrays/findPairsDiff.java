//Array: [5, 8, 2, 10, 15, 3]
import java.util.*;

class test9{

	public static void findPairsDiff(int[] arr,int n){
		
		sort(arr,n);
		
		System.out.println(arr[n-1] - arr[0]);
		System.out.println(arr[1] - arr[0]);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		for(int i=0;i<len;i++){
			
			arr[i] = sc.nextInt();
		}

		findPairsDiff(arr,len);
	}
	
	public static void sort(int[] arr, int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}