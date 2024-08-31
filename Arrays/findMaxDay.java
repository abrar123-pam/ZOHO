import java.util.*;

class task5{

	public static int findMaxDay(int[] arr, int n,int day){
	
		int sum =0,max = 0,count=0,red = 0;
		
		for(int i=0;i<n;i++){
			sum += arr[i];
			count++;
			
			if(count == day+1){
				sum -= arr[red++];
				count--;
			}
			max = Math.max(max,sum);
		}
		
		return max;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		for(int i=0;i<len;i++){
			
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter Days : ");
		int day = sc.nextInt();
		
		int ans = findMaxDay(arr, len,day);
		System.out.println(ans);
	}
}