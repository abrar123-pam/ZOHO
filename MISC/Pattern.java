import java.util.*;

class Pattern{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		printPattern(str);
	}
	
	
	public static void printPattern(String str){
		
		int n = str.length();
		
		int mid =n / 2;
		String sub = str.substring(mid)+str.substring(0,mid);
		
		for(int i=1;i<=n;i++){
			
			for(int j=n-i;j>=1;j--){
				System.out.print("-");
			}
			
			for(int k=1;k<=i;k++){
				System.out.print(sub.charAt(k-1));
			}
			
			
			System.out.println();
		}
	}
}