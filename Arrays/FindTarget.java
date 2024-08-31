import java.util.*;

class Test3{

	public static int findTarget(int n, int[] arr, int t,int s){
		if(s >= n){
			return -1 ;
		}
		
		if(arr[s] == t){
			return s;
		}
		
		return findTarget(n,arr,t,s+1);
	}

	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		int t = sc.nextInt();
		int ans = findTarget(n,arr,t,0);
		
		if(ans == -1){
			System.out.println("Element Not Found");
		}else{
			System.out.println("Element found ar index : "+ans);
		}
	}
}