import java.util.*;

class RemappingDigit{

	public static void findDifference(int num){
		String s = String.valueOf(num);
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) != '9'){
				char ch = s.charAt(i);
				s = s.replace(ch+"","9");
				break;
			}
		}
		
		System.out.println(s);
		int max = Integer.parseInt(s);
		
		String s1 = String.valueOf(num);
		
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i) != '0'){
				char ch = s1.charAt(i);
				s1 = s1.replace(ch+"","0");
				break;
			}
		}
		int min = Integer.parseInt(s1);
		System.out.println(s1);
		System.out.println(max - min);
		
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		findDifference(n);
		
	}
}

