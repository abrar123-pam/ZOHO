import java.util.*;

class encrypt{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int x = sc.nextInt();
		int n = s.length();
		for(int i=0;i<n;i++){
			int count = 0;
			for(int j=0;j<n;j++){
				if(s.charAt(i) == s.charAt(j))
					count++;
			}
			
			if(count % 2 == 0){
				//Increament
				char ch = s.charAt(i);
				ch += x;
				if(ch > 'z'){
					int val = (int)ch;
					int rem = val % x;
					System.out.println((char) x+1);
				}else{
					System.out.println(ch);
				}
				
			}else{
				//Decreament
				char ch = s.charAt(i);
				ch += x;
				if(ch < 'a'){
					int val = (int)ch;
					int rem = val % x;
					System.out.println((char) x-1);
				}else{
					System.out.println(ch);
				}
				
			}
		}
		
	}
}