import java.util.*;

class task1{

	public static void changeMat(int[][] mat, int r, int c, int k, int l){
		if(k >= r || l >= c){
			return;
		}
		
			int row = k;
            int col = l;

            for (int j = 0; j < c; j++) {
                mat[row][j]++;
            }

            for (int i = 0; i < r; i++) {
                mat[i][col]++;
            }
	}

	public static int findIndices(int mat[][],int r, int c, int[][] idmat, int idlen){
		
		for(int i=0;i<idlen;i++){
			for(int j=0;j<idlen - 1;j++){
				changeMat(mat, r, c, idmat[i][j], idmat[i][j+1]);

			}
		}
		
		int oddCount = 0;
		for(int i=0;i<r;i++){
			for(int j=0;j< c;j++){
				if(mat[i][j] % 2 != 0){
					oddCount++;
				}
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		return oddCount;
		
		
	} 

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int[][] mat = new int[rows][cols];
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				mat[i][j] = 0;
			}
		}
		
		System.out.println("Enter how many indices ");
		int ind = sc.nextInt();
		int[][] indicesArray = new int[ind][ind];
		for(int i=0;i<ind;i++){
			for(int j=0;j<ind;j++){
				indicesArray[i][j] = sc.nextInt();
			}
		}
		
		
		int oddNumbers = findIndices(mat,rows,cols,indicesArray,ind);
		System.out.println(" odd numbers are " +oddNumbers);
	}
}