import java.util.*;

class ReversePyramidPattern{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=n;i>=0;i--){
			for(int j=i;j<n;j++){
				System.out.print(" ");
			}
			
			for(int k=i-1;k>=0;k--){
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}