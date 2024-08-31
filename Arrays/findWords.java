import java.util.*;

class task1{

	public static void findWords(String input, int k){
		
		
	
		String[] splitArr = input.split(" ");
		
		try{
			if(k > splitArr.length){
				System.out.print("You have entered greater count");
				return;
			}
			for(int i=0;i<k;i++){
				System.out.print(splitArr[i] +" ");
			}
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.print(e.getMessage());
		}
		
		
	
	}


	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String input = sc.nextLine();
		
		
		System.out.print("Enter split words : ");
		int k = sc.nextInt();
		
		findWords(input,k);
	
	}
}