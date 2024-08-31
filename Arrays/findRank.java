import java.util.*;

class task7{

	static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
	
	
	public static int[] findRank(int[] arr1, int[] arr2, int l1, int l2){
		
		for(int i=0;i<l2;i++){
			
			for(int j=0;j<l2-i-1;j++){
				
				if(arr2[j] > arr2[j+1] || (arr2[j] == arr2[j + 1] && arr1[j] > arr1[j + 1])){
					swap(arr2, j, j + 1);
                    swap(arr1, j, j + 1);
				}
			}
		}
		
		return arr1;
	
	}
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array elements : ");
        int l1 = sc.nextInt();
        int[] arr1 = new int[l1];
        for (int i = 0; i < l1; i++) {
            arr1[i] = sc.nextInt();
        }
		
		System.out.print("Enter Rank elements : ");
        int l2 = sc.nextInt();
		
		if(l1 != l2){
			System.out.println("Array length and Rank length not matched");
			return;
		}
		
        int[] arr2 = new int[l2];
        for (int i = 0; i < l2; i++) {
            arr2[i] = sc.nextInt();
        }
		
		int[] ans = findRank(arr1,arr2,l1,l2);
		
		for(int i=0;i<l1;i++){
			System.out.print(ans[i] + " " );
		}
	
	}

}