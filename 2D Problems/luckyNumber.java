import java.util.*;

class luckyNumber{
	
	public static int findLuckyNumber(int[][] arr, int r, int c){
		int ans = 0;
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				int num = arr[i][j];
				if(isLucky(i,j,arr,num,r,c)){
					ans = num;
					break;
				}
			}
		}
		
		return ans;
	}
	
	public static boolean isLucky(int r,int c, int[][] arr,int num,int rows,int cols){
		
		boolean flag = true;
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(num > arr[r][j]){
					flag = false;
					break;
				}
				
				if(num < arr[i][c]){
					flag = false;
					break;
				}
			}
		}
		
		return flag;
		
	}
	
	

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter rows : ");
		int r = sc.nextInt();
		System.out.print("Enter cols : ");
		int c = sc.nextInt();
		
		int[][] arr = new int[r][c];
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(findLuckyNumber(arr,r,c));
		
	}
}