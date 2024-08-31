import java.util.*;

class alphabets{

	
	public static void printAlphabet(String alpha, int n){
		int len = alpha.length();
		int i=0,j=0;
		char[] ans = new char[n];
		int k = 0;
		while(i<len){
			int count = 0;
			
			while(j<len-1){
				for(int m=0;m<ans.length;m++){
					if(alpha.charAt(j) == ans[m])
						break;
					
				}
				
				if( alpha.charAt(j) == alpha.charAt(j+1)){
					count++;
					System.out.println("top"+count);
					j += 2;
				}
				
				
				if(alpha.charAt(i) == alpha.charAt(j)){
					count++;
					System.out.println("bot"+count);
				}
				j++;
				
			}
			if(count == n){
				System.out.print(alpha.charAt(i));
				ans[k++] = alpha.charAt(i);
			}
			i++;
		}
		
		System.out.println("Result in Order : ");
		for(int l=0;l<ans.length;l++){
			System.out.print(ans[l] +" ");
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String alpha = sc.next();
		int n = sc.nextInt();
		
		printAlphabet(alpha,n);
		
	}
	
}

