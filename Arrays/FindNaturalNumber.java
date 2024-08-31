import java.util.*;

class test2{
	
	public static boolean findNaturalNumber(int[][] arr, int r,int sum){
		
		for(int i=0;i<r;i++){
			int temp = sum;
			int temp2 = sum;
			for(int j=0;j<r;j++){
				temp -= arr[i][j];
				temp -= arr[j][i];  
			}
			
			if(temp > 0 || temp2 > 0){
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		int sum = 0,n=r;
		while(n!=0){
			sum+= n;
			n--;
		}
		//System.out.println(sum);
		int[][] arr = new int[r][r];
		
		for(int i=0;i<r;i++){
			for(int j=0;j<r;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println(findNaturalNumber(arr,r,sum));
		
	}
}