import java.util.*;

class UglyNumber{
	
	public static boolean checkUgly(int num){
	
		while(num > 1){
			if(num % 2==0){
				num /= 2;
			}else if(num% 3 == 0){
				num /= 3;
			}else if(num % 5 == 0){
				num /= 5;
			}else{
				return false;
			}
		}
		if(num == 1){
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		
		System.out.println(checkUgly(num));
		
		
	}
}