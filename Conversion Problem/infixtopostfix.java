import java.util.*;

class ItoP{
	
	public static String infixToPostFix(String exp){
		Stack<Character> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<exp.length();i++){
			char ch = exp.charAt(i);
			
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
				sb.append(ch);
			}else if(ch == '+' || ch == '-'){
				
				while (!st.isEmpty() && (st.peek() == '*' || st.peek() == '/' || st.peek() == '+' || st.peek() == '-')) {
                    sb.append(st.pop());
                }
				st.push(ch);
				
			}else if(ch == '*' || ch == '/'){
				while (!st.isEmpty() && (st.peek() == '*' || st.peek() == '/' || st.peek() == '^')) {
                    sb.append(st.pop());
                }
				st.push(ch);
			}else if(ch == '^'){
				while (!st.isEmpty() && st.peek() == '^') {
                    sb.append(st.pop());
                }
                st.push(ch);
			
			}else if(ch == '('){
				st.push('(');
			}else if(ch == ')'){
				while (!st.isEmpty() && st.peek() != '(') {
                    sb.append(st.pop());
                }
				
				if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
			}
		}
		while (!st.isEmpty()) {
            sb.append(st.pop());
        }
		return sb.toString();
		
	}
	
	public static void main(String[] args){
		String exp = "K+L-M*N+(O^P)*W/U/V*T+Q";
		System.out.println(infixToPostFix(exp));
	}
}