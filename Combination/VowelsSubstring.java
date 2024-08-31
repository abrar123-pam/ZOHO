import java.util.*;

class VowelsSubstring{

	public static long countVowels(String word) {
        long result = 0;
        int n = word.length();
        for(int i=0;i<n;i++){
            if(isVowel(word.charAt(i))){
				result += (long) (n-i) * (long)(i+1);
			}
        }
		
		return result;
    }
	
	static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		System.out.println(countVowels(input));
	}
}