import java.util.*;

class DownTraingle{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++){
			
			for(int j=0;j<2*n-1;j++){
				if(i == 0){
					System.out.print("*");
				}else if(i == j || j == 2*n-i-2){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}