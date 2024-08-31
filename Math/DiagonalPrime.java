import java.util.*;

class DiagonalPrime{
	
	public static boolean checkPrime(int n){
		if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
	}
	
	public static int checkPrime(int r, int c, int[][] mat){
		int max = -1;
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				if(i == j && checkPrime(mat[i][j])){
					if(mat[i][j] > max){
						max = mat[i][j];
					}
				}else if(j == c - i - 1 && checkPrime(mat[i][j])){
					if(mat[i][j] > max){
						max = mat[i][j];
					}
				}
				
			}
		}
		
		return max;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] mat = new int[r][c];
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(checkPrime(r,c,mat));
			
	}
}