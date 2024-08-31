import java.util.*;

class malfunctioningKeyboard{

	public static int checkKeyboard(String input, String broke){
		String[] arr= input.split(" ");
		int count = 0;
		for(int i=0;i<arr.length;i++){
			boolean flag = true;
			for(char c : arr[i].toCharArray()){
				if(broke.contains(c+""))
					flag = false;
					
			}
			if(flag)
				count++;
		}
		return count;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String broke = sc.next();
		
		System.out.println(checkKeyboard(input, broke));
	}
}