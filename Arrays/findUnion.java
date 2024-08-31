import java.util.*;

class task1{

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

	public static void findUnion(int[] arr1, int n1,int[] arr2, int n2){
		
		sort(arr1,n1);
		sort(arr2,n2);
		
		int i=0,j=0;
		while(i<n1 && j<n2){
			
			if(arr1[i] < arr2[j]){
				System.out.print(arr1[i] + " ");
				i++;
			}else if(arr2[j] < arr1[i]){
				System.out.print(arr2[j] + " ");
				j++;
			}else{
				System.out.print(arr2[j] + " ");
				i++;
				j++;
			}
		}
		
		while(i<n1){
			System.out.print(arr1[i] + " ");
			i++;
		}
		
		while(j<n2){
			System.out.print(arr2[j] + " ");
			j++;
		}
		
	} 

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		for(int i=0;i<len;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter length : ");
		int len1 = sc.nextInt();
		
		int[] arr1 = new int[len1];
		
		for(int j=0;j<len1;j++){
			arr1[j] = sc.nextInt();
		}
		
		findUnion(arr,len,arr1,len1);
		
		
		
	}
}