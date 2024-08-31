import java.util.*;

class task4{

	public static void sort(int[] arr, int n){
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void findConsecutive(int[] arr, int n){
		
		sort(arr,n);
		
		boolean check = true;
		for(int i=0;i<n-1;i++){
			int c = arr[i] +1;
			if(c != arr[i+1]){
			System.out.println("The array does not contain consecutive integers as element "+ arr[i] +" is repeated");
				check = false;
			}
		}
		
		if(check){
			System.out.print("The array contains consecutive integers from"+arr[0] +" to " + arr[n-1]);
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
		
		findConsecutive(arr,len);
	}

}
