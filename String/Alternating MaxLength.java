import java.util.*;

class task5{

	public static int AlternatingMaxLength(int[] arr, int n){
		int increasing = 1;
		int decressing = 1;
		int max = -1;
		
		for(int i=1;i<n;i++){
			if(arr[i] > arr[i-1]){
				increasing = decressing+1;
			}
			
			if(arr[i] < arr[i-1]){
				decressing = increasing+1;
			}
		}
		max = Math.max(increasing,decressing);
		
		return max;
	}

	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		for(int i=0;i<len;i++){
			arr[i] = sc. nextInt();
		}
		
		
		System.out.println(AlternatingMaxLength(arr,len));
		
	}
}