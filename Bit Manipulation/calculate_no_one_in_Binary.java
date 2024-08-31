import java.util.*;

class calculate_no_one_in_Binary{

	public static void calculateOne(int n){
		
		StringBuilder sb = new StringBuilder();
		int count = 0;
		while(n > 1){
			int r = n % 2;
			if(r == 1)
				count++;
				
			n /= 2;
		}
		sb.append(1);
		count++;
		System.out.println(count);
		//checkOnes(sb);
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		calculateOne(n);
	}
}