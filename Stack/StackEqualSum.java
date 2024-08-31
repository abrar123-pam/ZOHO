import java.util.*;

class Task2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Stack st1 = new Stack();
		Stack st2 = new Stack();
		Stack st3 = new Stack();
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int sum1=0,sum2 =0,sum3=0;
		for(int i=0;i<n1;i++){
			int val = sc.nextInt();
			st1.push(val);
			sum1 += val;
		}
		
		for(int i=0;i<n2;i++){
			int val = sc.nextInt();
			st2.push(val);
			sum2 += val;
		}
		
		for(int i=0;i<n3;i++){
			int val = sc.nextInt();
			st3.push(val);
			sum3 += val;
		}
		
		while((sum1 != sum2) && (sum2 != sum3) && (sum1 != sum3)){
			
			if(!st1.isEmpty()){
				int x = st1.pop();
				sum1 -= x;
			}
			
			if(!st2.isEmpty()){
				int x = st2.pop();
				sum2 -= x;
			}
			
			if(!st3.isEmpty()){
				int x = st3.pop();
				sum3 -= x;
			}
		}
		
		System.out.println(sum1);
	}
}