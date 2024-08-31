import java.util.*;

class PtoI{	

	public static boolean isOperator(char ch){
		
		switch(ch){
			case '+':
			case '-':
			case '*':
			case '/':
			case '^':
			case '%':
				return true;
		}
		return false;
	}
	
	public static String prefixtoinfix(String exp){
		
		Stack<String> st = new Stack<>();
		
		for(int i=exp.length()-1;i>=0;i--){
			char ch = exp.charAt(i);
			
			if(isOperator(ch)){
				String top1 = st.pop();
				String top2 = st.pop();
				
				String temp = "("+top1+ch+top2+")";
				st.push(temp);
			}else{
				st.push(ch+"");
			}
		}
		
		return st.pop();
	}

	public static void main(String[] args){
		
		String exp = "/-ab+-cde";
		
		System.out.println(prefixtoinfix(exp));
	}
}