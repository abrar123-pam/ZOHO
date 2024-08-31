import java.util.*;

class test1{
	
	public static boolean findXmatrix(int[][] arr, int r, int c){
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				if(i==j || i>0 && j >0 && i<r-2 && j<c-2){
					if(arr[i][j] <= 0){
						return false;
					}
				}
					if(arr[i][j] != 0){
						return false;
					}
				
			}
		}
		
		return true;
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
		
		System.out.println(findXmatrix(arr,r,c));
		
	}
}