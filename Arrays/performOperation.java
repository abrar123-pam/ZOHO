import java.util.*;

class task4{

	public static int performOperation(String[] arr, int n){
	
		 int x = 0;
		
		for(int i=0;i<n;i++){
			
			if(arr[i].equals("--x") || arr[i].equals("x--")){
				x -= 1;
				
			}else if(arr[i].equals("x++") || arr[i].equals("++x")){
				x += 1;
			}		
		}
		
		
		return x;
	
	}


	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your lenth : ");
		int len = sc.nextInt();
		
		String[] arr = new String[len];
		
		for(int i=0;i<len;i++){
			arr[i]= sc.next();
		}
		
		int ans =  performOperation(arr,len);
		
		System.out.println(ans);
	
	}
}
