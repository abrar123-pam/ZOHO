import java.util.*;

class task9{

	public static String findPermutation(String input){
		StringBuilder alphabet = new StringBuilder();
		StringBuilder digits = new StringBuilder();
		
		
		for(int i=0;i<input.length();i++){
			char ch = input.charAt(i);
			if(ch >= '0' && ch <= '9'){
				alphabet.append(ch);
			}else{
				digits.append(ch);
			}
		}
		int alnt = alphabet.length();
		int dlnt = digits.length();
		int diff = Math.abs(alnt-dlnt);
		
		if(diff > 1) return "";
		
		StringBuilder ans = new StringBuilder();
		int j=0,k=0;
		boolean flag = alnt>=dlnt?true:false;
		
		for(int i=0;i<input.length();i++){
			if(flag) ans.append(alphabet.charAt(j++));
			else ans.append(digits.charAt(k++));
			
			flag = !flag;
		}
		
		return ans.toString();
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		System.out.print(findPermutation(input));
		
		
	
	}
}