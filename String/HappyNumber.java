import java.util.*;

class HappyNumber{

	public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }

        return n == 1;
    }

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(isHappy(n)){
			System.out.println(n +" is a happy number");
		}else{
			
			System.out.println(n +" is not a happy number");
		}
	}
	
	
}

