import java.util.*;

class task8{

	static boolean checkForNum(int num,int A){
		while(num != 0){
			
			int rem = num % 10;
			
			if(rem == A){
				return true;
			}
			
			num /= 10;
		}
		
		
		return false;
	}

	public static int findSumIndex(int[] arr,int n, int A){
	
		int sum = 0;
		
		for(int i=0;i<n;i++){
		
			if(checkForNum(arr[i],A)){
				sum += i;
			}
		}
		
		return sum;
	}

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A value : ");
        int val = sc.nextInt();
        System.out.print("Enter Array elements : ");
        int l1 = sc.nextInt();
        int[] arr1 = new int[l1];
        for (int i = 0; i < l1; i++) {
            arr1[i] = sc.nextInt();
        }
	
		
		int ans = findSumIndex(arr1,l1,val);
		System.out.print(ans);
		
	}
}