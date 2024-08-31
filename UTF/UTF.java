import java.util.*;

class UTF{
		
	public static boolean validateUtf8(int[] data){
		int remaining = 0;
		
		for(int i: data){
			if(remaining == 0)
				if(i>>7 == 0b0){
					int k = i >> 7;
					System.out.println(i+ " -> "+ k);
					remaining =0;
				}
				else if(i>>5 == 0b110){
					int l = i >> 5;
					System.out.println(i+ " -> "+ l);
					remaining = 1;
				}
				else if(i>>4 == 0b1110){
					int m = i >> 4;
					System.out.println(i+ " -> "+m);
					remaining = 2;
				}
				else if(i>>3 == 0b11110){
					int n = i>>3;
					System.out.println(i+ " -> "+ n);
					remaining = 3;
				}
				else{
					return false;
				}
			else{
				if(i>>6 == 0b10)
					remaining--;
				else	
					return false;
			}
		}
		if(remaining == 0)
			return true;
	
		return false;
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			
			arr[i] = sc.nextInt();
		}
		
		System.out.println(validateUtf8(arr));
	}
}