import java.util.*;

class sortedColumns{

	public static int unsortColumsdel(String[] arr, int n ){
		
		int count =0;
		
		for(int i=0;i<arr[0].length();i++){
			
			for(int j=1;j<n;j++){
				 if(arr[j].charAt(i) - arr[j-1].charAt(i)<0){
					count++;
					break;
				 }
			}
			
		}
		return count;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] arr = new String[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.next();
		}
		
		int ans = unsortColumsdel(arr,n);
		System.out.println(ans);
	}
}