import java.util.*;

class task2{

	public static void findSign(int[] arr, int n){
	
		int product = 1;
		
		for(int i=0;i<n;i++){
			product *= arr[i];
		}
		
		System.out.println(Math.signum(product));
	}

	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your lenth : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		for(int i=0;i<len;i++){
			arr[i]= sc.nextInt();
		}
		
		findSign(arr,len);

		
	
	}

}

