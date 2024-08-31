import java.util.*;

class task5 {

	public static boolean match(String s,String pat){
		
		int i=0,j=0;
		
		while(i<s.length() && j<pat.length()){
			
			if(s.charAt(i) == pat.charAt(j)){
				i++;
				j++;
			}else{
				i++;
			}
		}
		
		return j==pat.length() && !hasNext(s.substring(i));
		
		
	}
	
	public static boolean hasNext(String next){
		int n = next.length();
		
		for(int i=0;i<n;i++){
			if(next.charAt(i) >= 'A' && next.charAt(i) <= 'Z'){
				return true;
			}
		}
		
		return false;
	}

	public static boolean[] matchPatter(String[] arr,String pat){
		
		boolean[] ans = new boolean[arr.length];
		int n = arr.length;
		for(int i=0;i<n;i++){
			ans[i] = match(arr[i],pat);
		}
		
		return ans;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] arr = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceBack"};
		String pattern = "FoBa";
		
		boolean[] ans = matchPatter(arr,pattern);
		for(boolean b : ans){
			System.out.print(b+",");
		}
		
		
	}
}