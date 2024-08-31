import java.util.*;

class task1{

	public static void findMaxSubArraY(int[] arr, int n){
		
		int max = -1;
		for(int i=0;i<n;i++){
			int sum = 0;
			for(int j=i;j<n;j++){
				sum += arr[j];
				if(sum > max){
					max = sum;
				}
			}
		}
		
		System.out.println(max);
	}
	
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		for(int i=0;i<len;i++){
			arr[i] = sc. nextInt();
		}
		
		findMaxSubArraY(arr,len);
	
	}
}