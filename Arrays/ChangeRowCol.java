import java.util.*;

class test44{

	public static void changerow(int[][] temp , int s,int r, int c){
		for(int i=0;i<r;i++){
				if(temp[i][s] !=0 ){
					temp[i][s] = -1;
				}
			
				
		}
	}
	
	public static void changecol(int[][] temp , int s,int r, int c){
		for(int i=0;i<c;i++){
				if(temp[s][i] !=0 ){
					temp[s][i] = -1;
				}
		}
	}

	
	public static void findZeroMatrix(int[][] arr, int r,int c){
		
		int[][] temp = new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<r;j++){
				temp[i][j]  = arr[i][j]; 
			}	
		}
		
		
		for(int i=0;i<r;i++){
			for(int j=0;j<r;j++){
				if(arr[i][j] == 0){
					changerow(temp,i,r,c);
					changecol(temp,j,r,c);
				}  
			}
		}
		
		for(int i=0;i<r;i++){
			for(int j=0;j<r;j++){
				if(temp[i][j] == -1){
					arr[i][j] = 0;
				}  
				
				System.out.print(arr[i][j] + " " );
			}
			System.out.println();
		}
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
		
		
		findZeroMatrix(arr,r,c);
		
	}
}