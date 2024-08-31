import java.util.*;

class  Hollow_diamond_star_pattern{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			
			for(int j=n;j>=i;j--){
				System.out.print(" ");
			}
			
			for(int k=0;k<2*i-1;k++){
				if(k == 0 || k == 2 * i-2){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		for(int i=n-1;i>=0;i--){
			
			for(int j=i;j<n;j++){
				System.out.print(" ");
			}
			
			for(int k=2*i-1;k>=0;k--){
				if(k == 0 || k == 2 * i-2){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}
}