import java.util.*;

class task5{
	
	public static int findSubstring(String str){
		int n = str.length();
		int count = 0;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				if(checkString(str.substring(i,j))){
					count++;
				}
			}
		}
		return count;
	}
	
	public static boolean checkString(String s){
		boolean flag = true;
		if(s.length() % 2 == 0){
			int st = 0;
			int e = s.length() -1;
			while(st <= e){ 
				if(s.charAt(st) != s.charAt(e)){	
					flag= false;
					break;
				}
				st++;
				e--;
			}
		}else{
			int mid = s.length()/2; 
			int start = 0;
			int end = s.length()-1; 
			while(start <= end){
				if(start == mid || end == mid){
					continue;
				}	
				if(s.charAt(start) != s.charAt(end)){ 
					flag= false;
					break; 
				}
				start++;
				end--;
			}
		}
		
		return flag;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		
		String input = sc.next();
		
		System.out.println(findSubstring(input));
	}
}
