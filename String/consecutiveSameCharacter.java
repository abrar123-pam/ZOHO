import java.util.*;

class consecutiveSameCharacter{

	public static void printConsecutiveChar(String input, int n ){
		ArrayList<String> list = new ArrayList<>();
		
		int i=0,j=0;
		
		while(j < n){
			if(input.charAt(i) != input.charAt(j)){
				int k = j-1;
				String sub = input.substring(i,j);
				String s = i+","+k;
				if(sub.length() >= 3){
					list.add(s);
				}
				i = j;
			}else{
				j++;
			}
		}
		
		for(String s : list){
			System.out.println(s);
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();		
		printConsecutiveChar(input,input.length());
	}
}