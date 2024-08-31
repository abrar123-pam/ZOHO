import java.util.*;

class task6{

	public static int gcd(int a,int b){
		return b == 0 ? a : gcd(b,a%b);
	}

	public static String gcdOfString(String s, String t){
		if(!(s + t).equals(t+s)){
			return "";
		}
		
		int gcdlength = gcd(s.length(),t.length());
		return s.substring(0,gcdlength);
	}

	public static int SmallestDivisibleString(String s1, String t1){
		if(!isDivisible(s1,t1)){
			return -1;
		}
		
		String u = gcdOfString(s1,t1);
		
		return u.length();
	}
	
	public static boolean isDivisible(String s, String t){
		if(s.length() % t.length() != 0){
			return false;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length()/t.length();i++){
			sb.append(t);
		}
		return sb.toString().equals(s);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String t1 = sc.nextLine();
		System.out.println(SmallestDivisibleString(s1,t1));
	}
}