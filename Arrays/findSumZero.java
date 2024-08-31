import java.util.*;

class task5{
	
	public static boolean findSumZero(int[] arr, int n){
		for(int i=0;i<n;i++){
			int sum = 0;
			for(int j=i;j<n;j++){
				sum+= arr[j];
				if(sum == 0){
					return true;
				}
			}
		}
		
		return false;
	} 

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		for(int i=0;i<len;i++){
			arr[i] = sc.nextInt();
		}
		
		if(findSumZero(arr,len)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}