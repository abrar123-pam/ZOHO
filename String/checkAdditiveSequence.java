import java.util.*;

class task2{
	
	public static boolean findRec(long n1, long n2,String s, boolean found){
		if(s.length()==0 && found)
			return true;
			
		String n3 = String.valueOf(n1+n2);
		int idx = Math.min(n3.length(),s.length());
		if(s.substring(0,idx).equals(n3))
			return findRec(n2,Long.parseLong(n3),s.substring(idx),true);
			
		return false;
		
		
	}

	public static boolean checkAdditiveSequence(String s){
		int n = s.length();
		for(int i=1;i<n-1;i++){
			long n1 = Long.parseLong(s.substring(0,i));
			for(int j=i+1;j<n;j++){
				long n2 = Long.parseLong(s.substring(i,j));
				
				boolean found = findRec(n1,n2,s.substring(j),false);
				if(found){
					return true;
				}
			}
		}
		
		return false;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		System.out.println(checkAdditiveSequence(input));
	}
}