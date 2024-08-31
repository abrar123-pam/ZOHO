import java.util.*;

class AddMa{
	
	public static void printGoatLatin(String[] arr, int n){
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++){
			String curr = arr[i];
			
			if(isVowel(curr.charAt(0))){
				sb.append(curr);
				sb.append("ma");
				int k = i+1;
				while(k!=0){
					sb.append("a");
					k--;
				}
				sb.append(" ");
			}else{	
				char c = curr.charAt(0);
				sb.append(curr.substring(1,curr.length()));
				sb.append(c);
				sb.append("ma");
				int k = i+1;
				while(k!=0){
					sb.append("a");
					k--;
				}
				sb.append(" ");
			}
			
		}
		
		System.out.println(sb);
		
	}
	
	public static boolean isVowel(char ch){
		
		if(ch == 'a'||ch == 'e'|| ch == 'i'||ch == 'o'|| ch == 'u'){
			return true;
		}
		return false;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] arr = input.split(" ");
		
		printGoatLatin(arr,arr.length);
	}
}