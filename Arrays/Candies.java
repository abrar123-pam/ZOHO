import java.util.*;

class Candies{

	public static boolean[] GreatestCandies(int[] arr, int n,int extraCandies){
		
		int greatet = 0;
		for(int i=0;i<n;i++){
			if(arr[i] > greatet){
				greatet = arr[i];
			}
			arr[i] += extraCandies;
		}
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i] + " ");
		}
		
		System.out.print(greatet);
		
		boolean[] res = new boolean[n];
		
		for(int i=0;i<n;i++){
			if(arr[i] >= greatet){
				res[i] = true;
			}else{
				res[i] = false;
			}
		}
		
		return res;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many kids");
		int kids = sc.nextInt();
		
		int[] kidArr = new int[kids];
		for(int i=0;i<kids;i++){
			kidArr[i] = sc.nextInt();

		}
		
		System.out.print("How many extra candies do you have : ");
		int cand = sc.nextInt();
		
		boolean[] ans = GreatestCandies(kidArr, kids,cand);
		
		for(int i=0;i<kids;i++){
			System.out.print(ans[i] + " ");
		}
	}
}