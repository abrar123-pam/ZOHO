import java.util.*;

class reformatPhoneNumber{

	public static String checkNumber(String input){
		String temp = "";
		for(char c: input.toCharArray()){
			if(c != ' ' && c !='/' && c != '-'){
				temp += c;
			}
		}
		
		int count = 0, idx = 0;
		int len = temp.length();
		String res = "";
		
		for(char ch : temp.toCharArray()){
			if(count == 0 && len <= 4){
				if(len == 3)
					res += temp.substring(idx,idx+3);
				else if(len == 2)
					res += temp.substring(idx, idx+2);
				else	
					res += temp.substring(idx,idx+2)+'-'+ temp.substring(idx+2, idx+4);
				break;
			}
			count++;
			res += ch;
			if(count % 3 == 0){
				res += "-";
				len -= count;
				count = 0;
			}
		}
		
		return res;
	}
	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		System.out.println(checkNumber(input));
	}
}