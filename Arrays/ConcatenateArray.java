import java.util.*;

class task3{

	public static void ConcatenateArray(int[] arr, int n){
	
		
		int[] secArr = new int[2*n];
		
		for(int i=0;i<n;i++){
		
			secArr[i] = arr[i];
			secArr[i+n] = arr[i];
		}
		
		
		for(int i=0;i<secArr.length;i++){
			System.out.print(secArr[i] + " " );
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your lenth : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		for(int i=0;i<len;i++){
			arr[i]= sc.nextInt();
		}
		
		ConcatenateArray(arr,len);
	}
}