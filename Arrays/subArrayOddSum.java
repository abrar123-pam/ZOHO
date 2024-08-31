import java.util.*;

class subArrayOddSum{

	public static int findSubarray(int[] arr, int n){
	
		
		int totalSum = 0;
		
		for(int i=0;i<n;i++){
			int tempSum = 0;
			for(int j=i;j<n;j++){
				tempSum += arr[j];
				if((j - i + 1)%2 != 0){
					//System.out.println(" SUM " +tempSum);
					totalSum += tempSum;
				}
			}
		}
		
		return totalSum;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of matrix");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		for(int i=0;i<length;i++){
			arr[i] = sc.nextInt();
		}
		
		int ans = findSubarray(arr, length);
		
		System.out.println(ans);
	}
}