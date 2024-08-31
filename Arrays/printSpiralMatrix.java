import java.util.*;

class task8{
	
	public static void printSpiralMatrix(int[][] arr, int rows,int cols){
		
		int left = 0;
		int right = arr[0].length - 1;
		int top = 0;
		int bottom = arr.length-1;
		
		while(left <= right && top <= bottom){
			
			for(int i=left;i<=right;i++){
				System.out.print(arr[top][i] +" ");
			}
			top++;
			
			for(int i=top;i<=bottom;i++){
				System.out.print(arr[i][right] +" ");
			}
			right--;
			
			if(top<=bottom){
				for(int i=right;i>=left;i--){
					System.out.print(arr[bottom][i] +" ");
				}
				bottom--;
			}
			
			if(left <= right){
				for(int i=bottom;i>=top;i--){
					System.out.print(arr[i][left] +" ");
				}
				left++;
			}
		}
	
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows : ");
		int r = sc.nextInt();
		System.out.println("Enter cols : ");
		int c = sc.nextInt();
		
		int[][] arr = new int[r][c];
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		printSpiralMatrix(arr,r,c);
	}
	
}