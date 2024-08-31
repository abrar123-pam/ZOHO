import java.util.*;

class task5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] arr = new int[r][c];
		
		for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
		
		System.out.println(countOnes(arr,r,c));
	}
	
	public static int countOnes(int[][] arr, int rows, int cols){
		
		int count = 0;
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(arr[i][j] == 1){
					count++;
				}
			}
		}
		
		return count;
	}
}