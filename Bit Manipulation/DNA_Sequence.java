import java.util.*;

class DNA_Sequence{
	
	public static void findRepeatedDnaSequences(String s){
		
		Set seen = new HashSet<>(),repeated = new HashSet<>();
		
		for(int i=0;i<s.length()-9;i++){
			String str = s.substring(i,i+10);
			if(seen.contains(str)){
				repeated.add(str);
			}
			seen.add(str);
		}
		
		System.out.println(repeated);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		findRepeatedDnaSequences(s);
	}
}