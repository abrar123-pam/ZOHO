
import java.util.*;

class leadingContiguousSubstring{

	public static int findPrefix(String[] arr, int n,String pref){
		
		int count = 0;
		int pLen = pref.length();
		
		for(int i=0;i<n;i++){
			if(arr[i].substring(0,pLen).equals(pref)){
				count++;
			}
		}
		
		return count;
	
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of String");
		int len = sc.nextInt();
		
		String[] arr = new String[len];
		
		for(int i=0;i<len;i++){
			arr[i]= sc.next();
		}
		
		System.out.println("Enter pref ");
		String pref = sc.next();
		
		int ans =  findPrefix(arr, len,pref);
		System.out.println(ans);
	
	}

}