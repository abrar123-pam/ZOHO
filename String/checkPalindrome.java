import java.util.*;

class task4{

	public static boolean checkPalindrome(String s){
		
		s = s.replaceAll("\\s","");
		int n = s.length();
		StringBuilder str = new StringBuilder();
		for(int i=0;i<n;i++){
			if(s.charAt(i) >=65 && s.charAt(i) <= 90){
				char smallAlpha = (char)(s.charAt(i)+32);
				str.append(smallAlpha);
			}else if(s.charAt(i) >=97 && s.charAt(i) <=122 || s.charAt(i) >= 48 && s.charAt(i) <= 57){
				str.append(s.charAt(i));
			}
		}
		
		return str.toString().equals(str.reverse().toString());
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		
		System.out.println(checkPalindrome(input1));
	}
}