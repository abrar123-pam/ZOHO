import java.util.*;

class defangedIPV4{

	public static void findDefangedString(String input, int n){
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++){
			if(input.charAt(i) == '.'){
				sb.append("[.]");
			}else{
				sb.append(input.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input  = sc.next();
		
		findDefangedString(input,input.length());
		
	
	}
}