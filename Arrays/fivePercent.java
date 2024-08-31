import java.util.*;

class fivePercent{

	public static double findMean(int[] arr, int n){
	
		Arrays.sort(arr);
		
		int idx = (int)(5/100)*n;
		
		int beg = idx;
		int end = n-idx;
		int sum = 0;
		
		int cnt = 0;
		for(int i=beg;i<end;i++){
			sum += arr[i];
			cnt++;
		}
		
		return sum/cnt;
	}

	public static void main(String[] args){
		int[] arr = {6,2,7,5,1,2,0,3,10,2,5,0,5,5,0,8,7,6,8,0};
		
		int len = arr.length;
		
		double ans = findMean(arr,len);
		System.out.println(ans);
		
	}
}