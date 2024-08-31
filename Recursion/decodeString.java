import java.util.*;

class task3{	
	public static void decodeString(String s){
		Stack<Integer> st = new Stack<>();
		Stack<String> sb1 = new Stack<>();
		
		for(char c : s.toCharArray()){
			if(c >= '0' && c <= '9'){
				st.push(Character.getNumericValue(c));
			}else if(c == ']'){
				StringBuilder sb = new StringBuilder();
				 while (!sb1.peek().equals("[")) { 
                    sb.insert(0, sb1.pop());
                }
				sb1.pop(); 
                int repeatCount = st.pop(); 
                StringBuilder repeated = new StringBuilder();
				for (int i = 0; i < repeatCount; i++) {
                    repeated.append(sb);
                }
                sb1.push(repeated.toString());
			}else{
				sb1.push(c+"");
			}
		}
		
		StringBuilder result = new StringBuilder();
		 while (!sb1.isEmpty()) {
            result.insert(0, sb1.pop()); 
        }
        System.out.println(result);
	}

	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		
		String input = sc.next();
		decodeString(input);
	}
}