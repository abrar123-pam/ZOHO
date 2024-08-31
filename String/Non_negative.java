import java.util.*;

class Non_negative{

	
	public static int solve(String s, int sum){
		if(s.length() == 1){
			return sum;
		}
		
		int val = Integer.parseInt(s);
		int rem = val % 10;
		val /= 10;
		
		return solve(val+rem+"",val+rem);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		System.out.println(solve(s,0));
	}
}