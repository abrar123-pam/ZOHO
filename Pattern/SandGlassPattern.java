import java.util.*;

class SandGlassPattern{
	
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
		
		for(int i=1;i<=n;i++){
			
			for(int j=i;j<n;j++){
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++){
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}