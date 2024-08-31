import java.util.*;

class SpiralMatrix{
	
	
	public static void printSpiral(int r, int c, int[][] arr){
		
		int top =0;
		int left = 0;
		int right = arr[0].length-1;
		int bottom = arr.length-1;
		int val = 1;
		
		while(left <= right && top <= bottom){
			
			for(int i=left;i<=right;i++){
				arr[top][i] = val++;
				
			}
			top++;
			
			for(int i=top;i<=bottom;i++){
				arr[i][right] = val++;
				
			}
			right--;
			
			
			if(top <= bottom){
				for(int i=right;i>=left;i--){
					arr[bottom][i] = val++;
					
				}
				bottom--;
			}
			
			if(left <= right){
				for(int i=bottom;i>=top;i--){
					arr[i][left] = val++;
					
				}
				left++;
			}
		
		}
		
		for(int i=0;i<arr[0].length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		int[][] arr = new int[r][r];
		
		
		printSpiral(r,r,arr);
		
		
	}
}