import java.util.*;

class test3{
	
	public static int findNegative(int[][] arr, int r, int c){
		int count = 0;
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				if(arr[i][j] < 0){
					count++;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] arr = new int[r][c];
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(findNegative(arr,r,c));
		
	}
}