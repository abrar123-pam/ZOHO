import java.util.*;

class SymmetricNumber{
	
	public static int len(int num){
		int count = 0;
		while( num != 0){
			count++;
			num /= 10;
		}
		
		return count;
	}
	
	public static boolean splitSum(int num , int s){
		int split = s/2;
		String s1 = String.valueOf(num);
		int leftSum = 0;
		for(int i=0;i<split;i++){
			leftSum += Integer.parseInt(s1.charAt(i)+"");
		}
		
		int rightSum = 0;
		for(int i=split;i<s;i++){
			rightSum += Integer.parseInt(s1.charAt(i)+"");
		}
		
		return leftSum == rightSum;
	}
	
	public static int checkSymmetric(int low, int high){
		
		int symCount = 0;
		for(int i=low;i<=high;i++){
			int l = len(i);
			if(l % 2 == 0){
				if(splitSum(i,l)){
					symCount++;
				}
			}
		}
		return symCount;
		
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int low = sc.nextInt();
		int high = sc.nextInt();
		
		System.out.println(checkSymmetric(low,high));
	}
}