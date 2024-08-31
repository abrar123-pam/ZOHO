import java.util.*;

class task8{

	  public static void split(int[] arr, int n){
        int[] firstArr = new int[n/2];
        int[] secArr = new int[(n % 2 == 0) ? n/2 : n/2 + 1];
        
        for(int i = 0; i < n; i++){
            if(i < n/2)
                firstArr[i] = arr[i];
            else
                secArr[i - n/2] = arr[i];
        }
        
        System.out.println(Arrays.toString(firstArr));
        System.out.println(Arrays.toString(secArr));
    }
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		for(int i=0;i<len;i++){
			
			arr[i] = sc.nextInt();
		}
		
		split(arr, len);
	}
	
	
}