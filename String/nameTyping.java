import java.util.*;

class nameTyping{

	public static boolean checkMistake(String s1, int n1, String s2, int n2){
		
		int i=0,j=0;
		
		while(i< n1 && j < n2){
			if(s1.charAt(i) == s2.charAt(j)){
				i++;
				j++;
				continue;
			}
			if(i >0 && s1.charAt(i-1) == s2.charAt(j))
				j++;
			else
				return false;
			
		}
		
		if(i<n1){
			return false;
		}
		
		while(j<n2){
			if(s1.charAt(n1-1) != s2.charAt(j)){
				return false;
			}
			j++;
		}
		
		return true;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();		
		String input2 = sc.nextLine();		
		System.out.println(checkMistake(input,input.length(),input2,input2.length()));
	}
}