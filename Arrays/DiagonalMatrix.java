import java.util.*;

class DiagonalMatrix{

	public static int findDiagonals(int[][] mat){
		
		if(mat.length == 1){
			return mat[0][0];
		}
		int primarySum = 0;
		int secondarySum = 0;
		
		int row = mat[0].length;
		int col = mat.length;
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(i==j){
					primarySum += mat[i][j];
				}
				
				if(i+j == row-1 && i!=j){
					secondarySum += mat[i][j];
				}
				
			}
		}
		
		return primarySum+secondarySum;
	
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of rows : ");
		int rows = sc.nextInt();
		
		System.out.print("Enter no of coloums : ");
		int coloum = sc.nextInt();
		
		int[][] mat = new int[rows][coloum];
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<coloum;j++){
				System.out.print("Enter "+i+" " +j+" " );
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Original Matrix ");
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<coloum;j++){
				System.out.print(mat[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
	
		int result = findDiagonals(mat);
		System.out.println(result);
		
	}
}