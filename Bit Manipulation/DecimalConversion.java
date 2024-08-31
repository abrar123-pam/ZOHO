import java.util.*;

class DecimalConversion{
	
	public static void converDecimal(long n){
		
		int dn = 0,i=0;
		while(n != 0){
			int rem =(int) n % 10;
			dn = dn + rem*(int)Math.pow(2,i);
			i++;
			n /= 10;
		}
		System.out.println(dn);
		printCount(dn);
	}
	
	public static void printCount(int dn){
		
		int count = 0;
		while(dn !=0){
			if(dn % 2 != 0){
				count++;
			}
			dn /= 2;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long input = sc.nextInt();
		
		converDecimal(input);
	
	}
	
}