import java.util.*;

class swapTwoLetter{

	public static boolean checkSwap(String input , String target){
		int n = input.length();
		char[] arr = input.toCharArray();
		
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				char temp =arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				if(Arrays.equals(arr, target.toCharArray())){
					return true;
				}
				//reswap
				temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
			}
			
			
			
		}
		
		return false;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		String target = sc.next();
		
		System.out.println(checkSwap(input, target));
	}
}