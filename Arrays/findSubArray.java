/*  Input: A[] ={2, 6, 0, 9, 7, 3, 1, 4, 1, 10} target = 15
Output: {6, 0, 9}
Input: A[] ={0, 5, -7, 1, -4, 7, 6, 1, 4, 1, 10} target = -3
Output: {1, -4}*/
import java.util.*;

class task6{

	public static void findSubArray(int[] arr, int n, int target){
		
		for(int i=0;i<n;i++){
			int sum = 0;
			for(int j=i;j<n;j++){
				sum += arr[j];
				if(sum > target){
					break;
				}
				if(sum == target){
					for(int k=i;k<=j;k++){
						System.out.print(arr[k] +" ");
					}
					System.out.println(); 
                    break;
				}

			}
		
			
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		for(int i=0;i<len;i++){
			
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter target : ");
		int target = sc.nextInt();
		
		findSubArray(arr,len,target);
		
	}
}