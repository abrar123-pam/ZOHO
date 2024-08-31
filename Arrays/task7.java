import java.util.*;

class task7{
	
	public static int[] sortArray(int[] arr, int n){
	
		int[] sorArr = new int[n];
		int pos = 0;
		int neg = n-1;
		
		for(int i=0;i<n;i++){
			
			if(arr[i] > 0){
				sorArr[pos++] = arr[i];
			}else{
				sorArr[neg--] = arr[i];
			}
		}
		
		
	/*	for(int i=0;i<n;i++){
			
			if(arr[i] < 0){
				int temp = arr[i];
				for(int j=i;j<n-1;j++){
					arr[j] = arr[j+1];
				
				}
				
				
				arr[n-1] = temp;
				for(int m=0;m<n;m++){
					System.out.print(arr[m] +" " );
				}
				System.out.println();
				
			}
			
		} */
		
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
			
			int[] ans = sortArray(arr,len);
			
			for(int i=0;i<len;i++){
				System.out.print(ans[i] +" " );
			}
		
		}

}