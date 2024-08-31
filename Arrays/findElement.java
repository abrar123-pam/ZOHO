import java.util.*;

class task3{
	
	public static int findElement(int[] arr, int n){
		
		sort(arr,n);
		int i;
		for( i=0;i<n-1;i+=2){
			if(arr[i] != arr[i+1]){
				return arr[i];
			}
		}
		
		return arr[i];
	
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		for(int i=0;i<len;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println(findElement(arr,len));
	}
	
	static void sort(int[] arr, int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]> arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =temp;
				}
			}	
		}
	}
}