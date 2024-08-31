					
import java.util.*;

class PowerSet{
	
	public static void subsets(int[] arr, int n){
		List<List<Integer>> list = new ArrayList<>();
		
		int subset = 1 << n ;
		for(int i=0;i<subset;i++){
			List<Integer> temp = new ArrayList<>();
			
			for(int j=0;j<n;j++){
				if((i & (1 << j)) != 0)
					temp.add(arr[j]);
			}
			list.add(temp);
		}
		System.out.println(list);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		subsets(arr,n);
	}
}