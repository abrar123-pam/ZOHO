import java.util.*;

public class Suduko{
	public static void main(String[] args){
		char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
        };
                {'.','.','.','.','8','.','.','7','9'}
		
		solveSuduko(board);
		
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void solveSuduko(char[][] board){
		solve(board);
	}
	
	public static boolean solve(char[][] board){
		
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(board[i][j] == '.'){
					for(char c='1';c<= '9';c++){
						if(isValid(i,j,c,board)){
							board[i][j] = c;
						
							if(solve(board)){
								return true;
							}else{
								board[i][j] = '.';
							}
						}
					}
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static boolean isValid(int row, int col,char c,char[][] board){
		
		for(int i=0;i<9;i++){
			if(board[row][i] == c) return false;
			
			if(board[i][col] == c) return false;
			
			if(board[3 * (row/3) + i/3][3 * (col/3) + i%3] == c) return false;
		}
		
		return true;
	}
}