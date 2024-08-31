import java.util.*;

class task3{
	
	public static String addBinary(String s1, String s2){
		
		int n1 = s1.length() -1;
		int n2 = s2.length() -1;
		int c =0,base = 2;
		
		StringBuilder res = new StringBuilder();
		while(n1>=0 || n2 >=0){
			
			int t1=0,t2=0,sum;
			if(n1>=0)
				t1=s1.charAt(n1--)-'0';
			
			if(n2>=0)
				t2=s2.charAt(n2--)-'0';
			sum = t1+t2+c;
			if(sum >= base){
				c=1;
				sum = sum - base;
			}else{
				c=0;
				
			}
			res.append(sum);
		}
		if(c==1){
			res.append(c);
		}
		
		
		return res.reverse().toString();
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		
		String input2 = sc.next();
		
		System.out.print(addBinary(input1,input2));
		
		
		
	
	}
}