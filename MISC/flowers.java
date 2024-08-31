import java.util.*;

class flowers{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = sc.nextInt();
		
		int b =  sc.nextInt();
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<=n;i++){
			int k = n-i;
			int ans = (a * (i*i)) + (2 *(k * k));
			min = Math.min(min,ans);
		}
		
		System.out.println(min);
	}
}