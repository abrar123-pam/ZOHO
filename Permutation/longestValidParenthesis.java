import java.util.*;

class longestValidParenthesis{
	
	public static int validParenthesis(String input){
		
		int maxLength = -1;
		for(int i=0;i<input.length();i++){
			//StringBuilder sb = new StringBuilder();
			for(int j=i;j<input.length();j++){
				String sub = input.substring(i,j+1);
				if(check(sub)){
					int len = sub.length()/2;
					maxLength = Math.max(maxLength,len);
				}
			}
		}
		
		return maxLength;
	}
	
	public static boolean check(String sub){
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < sub.length(); i++){
			char c = sub.charAt(i);
			if(c == '('){
				stack.push(c);
			} else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
				stack.pop();
			} else {
				return false; 
			}
		}
		return stack.isEmpty(); 
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String input  = sc.next();
		
		System.out.println(validParenthesis(input));
	}
}