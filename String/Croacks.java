import java.util.*;

class test3{

	public static int findCroacks(String input){
		int c=0,r=0,o=0,a=0,k=0;
		int activeFrog = 0;
		int max = -1;
		
		for(char ch:input.toCharArray()){
			
			switch(ch){
				case 'c':
					c++;
					activeFrog++;
					break;
				case 'r':
					r++;
					break;
				case 'o':
					o++;
					break;
				case 'a':
					a++;
					break;
				case 'k':
					k++;
					activeFrog--;
					break;
			}
			max = Math.max(max,activeFrog);
			if(c<r||r<o||o<a||a<k){
				return -1;
			}
			
		}
		
		return max;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		
		String input = sc.next();
		
		System.out.println(findCroacks(input));
	}
}
