import java.util.*;

class Task3{
		
	public static String removeOuterParentheses(String input){
		
		Stack st = new Stack();
		
		StringBuilder sb = new StringBuilder();
		
		for(char ch : input.toCharArray()){
			if(ch == '('){
				if(st.size() > 0){
					sb.append(ch);
				}
				st.push(ch);
			}else{
				st.pop();
				if(st.size() > 0){
					sb.append(ch);
				}
			}
			
		}
		
		return sb.toString();
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		System.out.println(removeOuterParentheses(input));
	}
}