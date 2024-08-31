import java.util.*;

class Task1{
	
	public static boolean isValidString(String str,Stack st){
		
		for(char ch : str.toCharArray()){
			if(ch == '('|| ch == '{' || ch == '['){
				st.push(ch);
			}
			else if(ch == ')'|| ch == '}' || ch == ']'){
				if(st.isEmpty()){
					return false;
				}
				
				char c = st.pop();
				
				if((ch == ')' && c != '(') ||
                    (ch == '}' && c != '{') ||
                    (ch == ']' && c != '[')){
                        return false;
                    }
			}
		}
		
		return st.isEmpty();
		
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		String str = sc.next();
		
		System.out.println(isValidString(str,s));
	}
}