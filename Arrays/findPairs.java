import java.util.*;

class task6{


	public static boolean findPairs(int[] arr, int n){
		
		if(n%2 != 0){
				return false;
		}
			
		for(int i=0;i<n;i++){
		
			for(int j=i+1;j<n;j++){
			
				if(arr[j] == -1){
					continue;
				}
				
				if(arr[i] == arr[j]){
					
					arr[j] = -1;
					arr[i] = -1;
					break;
				}
			}
		}
		
		for(int i=0;i<n;i++){
			if(arr[i] > 0 ){
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements : ");

        int e = sc.nextInt();

        int[] arr = new int[e];

        for (int i = 0; i < e; i++) {

            arr[i] = sc.nextInt();
        }
		
		boolean ans = findPairs(arr,e);
		System.out.println(ans);
	}

}