import java.util.*;

class Occurence{
	
	public static void main(String[] args){
		
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		printOccurenct(n,arr);
		
	}
	
	public static void printOccurenct(int n, int[] arr){
		
		Arrays.sort(arr);
		int count = 0;
		int i=0,j=0;
		
		while(j<n){
			if(j == n-1){
				count++;
				System.out.println(arr[i] +" - "+ count);
			}
			if(arr[i] == arr[j]){
				count++;
				j++;
			}else{
				
				System.out.println(arr[i] +" - "+ count);
				count = 0;
				i =j;
			}
		}
	}
}
