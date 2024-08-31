import java.util.*;

class task2{
	
	public static int getValue(char ch){
		
		switch(ch){
			
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
			default:
				return 0;
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		int sum = 0;
		int n = input.length();
		for(int i=0;i<n;i++){
			char ch1 = input.charAt(i);
			
			if((i+1) <n && getValue(ch1) < getValue(input.charAt(i+1))){
				sum -= getValue(ch1);
			}else{
				sum += getValue(ch1);
			}
		}
		
		System.out.println(sum);
		
	
	}
}