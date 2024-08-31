import java.util.*;

class possible{
	
	public static void possibleWords(String s, String[] numbers){
		
		for(int i=1;i<numbers.length;i++){
			String curr = numbers[i];
			int count = 0;
			for(int j=0;j<curr.length();j++){
				for(int k=0;k<s.length();k++){
					if(curr.charAt(j) == s.charAt(k)){
						count++;
					}
				}
			}
			if(count == curr.length()){
				System.out.print(numbers[i]+" ");
			}
		}
		
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		String s = sc.next();
		String[] numbers = {" ","one","two","three","four","five","six","seven","eight","nine","ten"};
		
		possibleWords(s,numbers);
	}
	

	
}