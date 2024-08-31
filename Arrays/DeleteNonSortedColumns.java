import java.util.*;

class DeleteNonSortedColumns{
	
	public static int findNonSortedColumns(String[][] mat, int rows, int cols){
		
		int count = 0;
		for(int j=0;j<cols;j++){
			for(int i=1;i<rows;i++){
				for(int k = 0; k < mat[i][j].length(); k++) {
                    if(mat[i][j].charAt(k) < mat[i - 1][j].charAt(k)){
                        count++;
                        break;
                    }
                    else if(mat[i][j].charAt(k) > mat[i - 1][j].charAt(k)) {
                        break;
                    }
                }
				
			}
		}
		
		return count;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter rows length : ");
		int rows = sc.nextInt();

		System.out.println("enter rows length : ");
		int cols = sc.nextInt();
		
		String[][] mat = new String[rows][cols];
		
		for(int i=0;i<rows;i++){
			
			for(int j=0;j<cols;j++){
				mat[i][j] = sc.next();
			}
		}
		
		int ans = findNonSortedColumns(mat,rows,cols);
		System.out.println(ans);
		
	}
}