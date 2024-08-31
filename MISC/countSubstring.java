import java.util.*;

class countSubstring{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int n= s.length();
		
		int count = 0;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				String sub = s.substring(i,j+1);
				if(sub.length() > 1){
					if(sub.charAt(0) == '1' && sub.charAt(sub.length() -1) == '1'){
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}