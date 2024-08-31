
import java.util.*;

class fibnocciStrings{

	public static String generateFibonacci(int k){
		String a = "a";
		String b = "b";
		
		for(int i=2;i<=k;i++){
			String temp = b+a;
			a = b;
			b = temp;
		}
		return a;
	}

	public static void findFibonacci(String[] arr, int n, String fib){
		for(String s : arr){
			int count = countSubString(s,fib);
			System.out.println(count);
		}
	}
	
	public static int countSubString(String s , String fib){
		
		int count = 0;
		for(int i=0;i<fib.length();i++){
			for(int j=i;j<=fib.length();j++){
				if(s.equals(fib.substring(i,j))){
				//	System.out.println(fib.substring(i,j));
					count++;
				}
			}
		}
	
		return count;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter k : ");
		int k = sc.nextInt();
		System.out.println("Enter m :  ");
		int m = sc.nextInt();
		String[] arr = new String[m];
		
		for(int i=0;i<m;i++){
			arr[i] = sc.next();
		}
		
		String fib = generateFibonacci(k);
		findFibonacci(arr,m,fib);		
	}
	
	
}