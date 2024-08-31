import java.util.*;

class task1{


	public static int findMatches(String str){
		int n = str.length();
		int i=0,j=i+1,k=j+1,l=k+1;
		int count = 0;
		
		while(i < n-3){
			while(j<n-2){
				while(k<n-1){
					while(l<n){
						if (str.charAt(i) == str.charAt(k) && str.charAt(j) == str.charAt(l)) {
                            count++;
                        }
						l++;
					}
					k++;
					l = k+1;
				}
				j++;
				k = j+1;
				l = k+1;
			}
			i++;
			j = i+1;
			k = j+1;
			l = k+1;
		}
		
		
		return count;
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		
		String input = sc.next();
		
		System.out.println(findMatches(input));
	}
}